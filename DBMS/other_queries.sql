-- Sample employees table
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    department_id INT,
    salary DECIMAL(10, 2)
);

-- Sample departments table
CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50)
);

-- Insert sample data into employees table
INSERT INTO employees VALUES
(1, 'John', 'Doe', 1, 60000),
(2, 'Jane', 'Smith', 2, 50000),
(3, 'Bob', 'Johnson', 1, 70000),
(4, 'Alice', 'Williams', 3, 80000),
(5, 'Charlie', 'Brown', 2, 55000);

-- Insert sample data into departments table
INSERT INTO departments VALUES
(1, 'IT'),
(2, 'HR'),
(3, 'Finance');

-- 1. SELECT INTO: Create a new table using the result of a SELECT statement
SELECT * INTO new_employees FROM employees WHERE department_id = 1;

-- 2. INSERT INTO SELECT: Insert data into an existing table from the result of a SELECT statement
INSERT INTO employees (first_name, last_name, department_id, salary)
SELECT 'David', 'Jones', 1, 75000;

-- 3. VIEWS: Create a view that combines employee and department information
CREATE VIEW employee_department_view AS
SELECT employees.employee_id, employees.first_name, employees.last_name, employees.salary, departments.department_name
FROM employees
INNER JOIN departments ON employees.department_id = departments.department_id;

-- Query the view
SELECT * FROM employee_department_view;

-- 4. NULL VALUES: Insert a record with null values
INSERT INTO employees VALUES (6, 'Eva', 'Miller', NULL, NULL);

-- Query all employees, including those with null values
SELECT * FROM employees;

-- 5. NULL FUNCTIONS: Use functions to handle null values
-- COALESCE: Return the first non-null expression in the list
SELECT first_name, COALESCE(salary, 0) AS adjusted_salary FROM employees;

-- IS NULL: Retrieve records where a specific column is null
SELECT * FROM employees WHERE salary IS NULL;

-- IS NOT NULL: Retrieve records where a specific column is not null
SELECT * FROM employees WHERE salary IS NOT NULL;
