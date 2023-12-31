-- Sample INSERT statement
INSERT INTO employees (employee_id, first_name, last_name, salary)
VALUES (3, 'Alice', 'Johnson', 75000);

-- Sample UPDATE statement
UPDATE employees
SET salary = 80000
WHERE employee_id = 1;

-- Sample DELETE statement
DELETE FROM employees
WHERE employee_id = 2;

-- Sample SELECT statement
SELECT * FROM employees;

-- Sample SELECT with JOIN
SELECT 
    e.employee_id,
    CONCAT(e.first_name, ' ', e.last_name) AS full_name,
    e.salary,
    es.max_salary
FROM employees AS e
INNER JOIN employee_salaries AS es ON e.employee_id = es.employee_id;
