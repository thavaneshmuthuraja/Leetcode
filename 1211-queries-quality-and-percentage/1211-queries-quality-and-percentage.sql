# Write your MySQL query statement below
select q.query_name,
round
(
(
    select sum(q1.rating/q1.position) as val from Queries q1 
    where q.query_name=q1.query_name
)
/count(q.query_name),
2) 
as "quality", 

round(
(
    select count(q2.rating) from Queries q2 
    where q.query_name=q2.query_name and q2.rating<3
)
/count(q.query_name) *100,
2)
as "poor_query_percentage"
from Queries q 
group by (q.query_name) ;