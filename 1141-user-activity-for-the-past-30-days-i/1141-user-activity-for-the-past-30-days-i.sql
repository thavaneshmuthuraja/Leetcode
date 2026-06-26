# Write your MySQL query statement below
select a1.activity_date "day",count(distinct a1.user_id) "active_users" from Activity a1

where datediff('2019-07-27',a1.activity_date) between 0 and 29 
group by a1.activity_date;
