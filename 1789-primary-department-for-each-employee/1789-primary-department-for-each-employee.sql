# Write your MySQL query statement below
SELECT employee_id,department_id FROM employee WHERE primary_flag="Y"
UNION SELECT employee_id,department_id FROM employee GROUP BY employee_id HAVING count(employee_id)=1; 
