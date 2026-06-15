# Write your MySQL query statement below
select id from Weather w 
where w.temperature>
(
    select w1.temperature from weather w1
    where date_sub(w.recordDate,interval 1 day)=w1.recordDate
);