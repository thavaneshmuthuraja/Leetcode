# Write your MySQL query statement below
select s.user_id,round((
    select count(*)  from Confirmations c1 
    where s.user_id=c1.user_id 
    and c1.action="confirmed" 
)/count(s.user_id),2) as "confirmation_rate" from Signups s
left join Confirmations c on s.user_id=c.user_id group by (s.user_id);