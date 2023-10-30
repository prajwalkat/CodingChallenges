# Write your MySQL query statement bel

#select person_name,max(c) from (Select a.person_name ,sum(b.weight) as c from Queue a,queue b where b.turn<=a.turn group by a.person_name order by a.turn) as d where c<=1000;

# select person_name , c from (Select * from (Select a.person_name ,sum(b.weight) as c from Queue a,queue b where b.turn<=a.turn group by a.person_name order by a.turn) as d where c<=1000) as e where c=(select max(c) from (Select a.person_name ,sum(b.weight) as f from Queue a,queue b where b.turn<=a.turn group by a.person_name order by a.turn) ) as y ;

Select  person_name from (select person_name,c from (Select a.person_name ,sum(b.weight) as c from Queue a,queue b where b.turn<=a.turn group by a.person_name order by a.turn) as d where c<=1000 order by 2 desc limit 1) as m;



