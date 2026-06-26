# Write your MySQL query statement below

select round(count(*)/(select count(distinct a4.player_id) from Activity a4),2) fraction from Activity a1 
join (select a2.player_id ,min(event_date) as e_date from Activity a2 group by (a2.player_id)) as a3 
where (a3.player_id=a1.player_id and datediff(a1.event_date,a3.e_date)=1);