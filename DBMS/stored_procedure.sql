-- Drop procedures if they exist
DROP PROCEDURE IF EXISTS calculate_bonus_percentage;
DROP PROCEDURE IF EXISTS employee_bonus_grade;

-- Create procedure 1 - calculate_bonus_percentage
CREATE PROCEDURE calculate_bonus_percentage(@employee_id AS INT, @bonus_out_of AS DECIMAL(10, 2) = 100)
AS 
BEGIN
    SELECT
        e.employee_id AS Employee_ID,
        CONCAT(e.first_name, ' ', e.last_name) AS Employee_Name,
        e.salary AS Salary,
        (CASE WHEN (e.salary / MAX(es.max_salary))*@bonus_out_of > 0
            THEN (e.salary / MAX(es.max_salary))*@bonus_out_of
            ELSE 'No salary information'
        END) AS Bonus_Percentage
    FROM
        employees AS e
    INNER JOIN employee_salaries AS es ON e.employee_id = es.employee_id
    WHERE e.employee_id = @employee_id
    GROUP BY e.employee_id, CONCAT(e.first_name, ' ', e.last_name), e.salary;
END;

-- Execute procedure 1
EXEC calculate_bonus_percentage @employee_id = 1;

-- Execute procedure 1 with different employee_id
EXEC calculate_bonus_percentage @employee_id = 2;

-- Create procedure 2 - employee_bonus_grade
CREATE PROCEDURE employee_bonus_grade(
    @employee_id AS INT, 
    @bonus_out_of AS DECIMAL(10, 2) = 100, 
    @grade AS VARCHAR(23) OUTPUT
)
AS
BEGIN
    DECLARE @bonus_percentage AS DECIMAL(10, 2)

    SELECT 
        @bonus_percentage = 
            (CASE WHEN (e.salary / MAX(es.max_salary))*@bonus_out_of > 0
                THEN (e.salary / MAX(es.max_salary))*@bonus_out_of
                ELSE -1
            END)
    FROM employees as e
    INNER JOIN employee_salaries as es ON e.employee_id = es.employee_id
    WHERE e.employee_id = @employee_id;

    IF @bonus_percentage = -1
    BEGIN
        -- Output result and set grade to -1
        SELECT @bonus_percentage AS 'Bonus Percentage', 'No salary information' AS 'Result';
        SET @grade = '-1';
    END
    ELSE
        IF @bonus_percentage > 90
            SET @grade = 'A'
        ELSE IF @bonus_percentage > 80
            SET @grade = 'B'
        ELSE IF @bonus_percentage > 70
            SET @grade = 'C'
        ELSE IF @bonus_percentage > 60
            SET @grade = 'D'
        ELSE IF @bonus_percentage > 50
            SET @grade = 'E'
        ELSE
            SET @grade = 'F';
END;

-- Execute procedure 2 and display result
DECLARE @result VARCHAR(1)
EXEC employee_bonus_grade @employee_id = 1, @grade = @result OUTPUT
SELECT @result AS 'Bonus Grade';

-- Execute procedure 2 with different employee_id and display result
DECLARE @result VARCHAR(1)
EXEC employee_bonus_grade @employee_id = 2, @grade = @result OUTPUT
SELECT @result AS 'Bonus Grade';
