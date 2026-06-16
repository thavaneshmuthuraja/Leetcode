# Write your MySQL query statement below
select e1.name,b.bonus from 
Employee e1 left join Bonus b
on e1.empId=b.empId
where b.bonus<1000 or b.bonus is null;