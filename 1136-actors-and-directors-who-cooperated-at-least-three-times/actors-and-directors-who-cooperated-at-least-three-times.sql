# Write your MySQL query statement below
Select actor_id,director_id 
from ActorDirector
Group by director_id , actor_id 
Having Count(*)>=3;