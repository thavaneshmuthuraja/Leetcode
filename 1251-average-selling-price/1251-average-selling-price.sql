# Write your MySQL query statement below
select p.product_id,ifnull(round(sum(p.price*us.units)/sum(us.units),2),0) as "average_price" from Prices p 
left join UnitsSold us
on us.purchase_date between p.start_date and p.end_date 
and p.product_id=us.product_id group by p.product_id; 