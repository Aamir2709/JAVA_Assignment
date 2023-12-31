-- Sample employees table
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department VARCHAR(50),
    salary DECIMAL(10, 2)
);

-- Insert sample data
INSERT INTO employees VALUES
(1, 'John', 'Doe', 'IT', 60000),
(2, 'Jane', 'Smith', 'HR', 50000),
(3, 'Bob', 'Johnson', 'IT', 70000),
(4, 'Alice', 'Williams', 'Finance', 80000),
(5, 'Charlie', 'Brown', 'HR', 55000);

-- DISTINCT: Retrieve unique values from a column
SELECT DISTINCT department FROM employees;

-- WHERE: Retrieve records based on a condition
SELECT * FROM employees WHERE salary > 60000;

-- AND / OR: Retrieve records based on multiple conditions
SELECT * FROM employees WHERE department = 'IT' AND salary > 60000;
SELECT * FROM employees WHERE department = 'IT' OR department = 'HR';

-- IN: Retrieve records with values in a specified list
SELECT * FROM employees WHERE department IN ('IT', 'HR');

-- BETWEEN: Retrieve records with values within a range
SELECT * FROM employees WHERE salary BETWEEN 50000 AND 70000;

-- ORDER BY: Retrieve records with sorting
SELECT * FROM employees ORDER BY salary DESC;

-- GROUP BY: Group records based on a column
SELECT department, COUNT(*) AS employee_count FROM employees GROUP BY department;

-- HAVING: Filter records after grouping
SELECT department, AVG(salary) AS avg_salary FROM employees GROUP BY department HAVING AVG(salary) > 60000;

-- SELECT TOP: Retrieve a specific number of rows
SELECT TOP 3 * FROM employees ORDER BY salary DESC;

-- LIKE / WILDCARDS: Retrieve records based on pattern matching
SELECT * FROM employees WHERE first_name LIKE 'J%';

-- ALIASES: Rename columns or tables for better readability
SELECT first_name AS "First Name", last_name AS "Last Name" FROM employees;
