# Write your MySQL query statement below
SELECT p.firstname,p.lastName,a.city,a.state from Person  p LEFT JOIN Address a on p.personId = a.personId; 