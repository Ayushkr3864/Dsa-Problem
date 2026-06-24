# Write your MySQL query statement below
SELECT MAX(salary)  AS SecondHighestSalary FROM  Employee  where salary  <(select max(salary) from Employee ) ;
