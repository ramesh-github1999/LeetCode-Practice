# Write your MySQL query statement below
select contest_id, round((count(contest_id))*100/( select count(*) from users),2) as percentage  from Register group by contest_id 
order by percentage desc, contest_id asc

/*SELECT COUNT(CustomerID), Country
FROM Customers
GROUP BY Country;*/

