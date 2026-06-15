# Write your MySQL query statement below
select
    (
        select p.product_name 
        from 
        Product as p 
        where s.product_id=p.product_id
    )
    as "product_name",
s.year,s.price
from Sales as s;