# Write your MySQL query statement below
select round(sum(
    case 
        when d1.order_date = d1.customer_pref_delivery_date and 
        d1.order_date=
        (
            select min(order_date) from Delivery d2
            where d1.customer_id=d2.customer_id
        ) 
        then 1
        else 0
    end)*100/count(distinct d1.customer_id),2) as immediate_percentage from Delivery d1;