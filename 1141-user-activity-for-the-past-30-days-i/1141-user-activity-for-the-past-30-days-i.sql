# Write your MySQL query statement below
select a1.activity_date "day",count(distinct a1.user_id) "active_users" from Activity a1

where activity_date between '2019-06-28' and '2019-07-27'
group by a1.activity_date;
