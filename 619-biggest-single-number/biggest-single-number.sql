# Write your MySQL query statement below

Select MAX(num) As num FROM MyNumbers
where num In(
SELECT num 
from Mynumbers
Group By num
Having Count(*)=1
)

