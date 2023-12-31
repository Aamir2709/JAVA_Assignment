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

-- INNER JOIN: Retrieve employee details along with department names
SELECT employees.employee_id, employees.first_name, employees.last_name, employees.salary, departments.department_name
FROM employees
INNER JOIN departments ON employees.department_id = departments.department_id;

-- LEFT JOIN: Retrieve all employees and their department names (even if they don't belong to any department)
SELECT employees.employee_id, employees.first_name, employees.last_name, employees.salary, departments.department_name
FROM employees
LEFT JOIN departments ON employees.department_id = departments.department_id;

-- RIGHT JOIN: Retrieve all departments and their employees (even if there are no employees)
SELECT employees.employee_id, employees.first_name, employees.last_name, employees.salary, departments.department_name
FROM employees
RIGHT JOIN departments ON employees.department_id = departments.department_id;

-- FULL OUTER JOIN: Retrieve all employees and all departments
SELECT employees.employee_id, employees.first_name, employees.last_name, employees.salary, departments.department_name
FROM employees
FULL OUTER JOIN departments ON employees.department_id = departments.department_id;

-- SELF JOIN: Retrieve employees who share the same department
SELECT e1.employee_id AS employee1_id, e1.first_name AS employee1_name, e2.employee_id AS employee2_id, e2.first_name AS employee2_name, e1.department_id
FROM employees e1
JOIN employees e2 ON e1.department_id = e2.department_id AND e1.employee_id < e2.employee_id;

-- CROSS JOIN: Retrieve all possible combinations of employees and departments
SELECT employees.employee_id, employees.first_name, employees.last_name, employees.salary, departments.department_name
FROM employees
CROSS JOIN departments;

-- UNION: Combine results from two SELECT statements
SELECT first_name, last_name FROM employees
UNION
SELECT department_name, '' FROM departments;

-- INTERSECT: Retrieve common records from two SELECT statements
SELECT first_name, last_name FROM employees
INTERSECT
SELECT department_name, '' FROM departments;

-- EXCEPT: Retrieve records from the first SELECT statement that are not present in the second SELECT statement
SELECT first_name, last_name FROM employees
EXCEPT
SELECT department_name, '' FROM departments;
