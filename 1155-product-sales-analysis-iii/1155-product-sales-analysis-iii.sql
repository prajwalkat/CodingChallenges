# Write your MySQL query statement below

 Select i.product_id,i.year as "first_year",quantity,price from Sales,(Select product_id,min(year) as year from Sales group by product_id) as i where i.product_id=Sales.product_id and i.year=Sales.year; 


#(Select product_id,min(year) as year from Sales group by product_id);