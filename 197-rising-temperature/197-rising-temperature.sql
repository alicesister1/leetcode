# Write your MySQL query statement below

SELECT w1.Id 
FROM Weather w1, Weather w2
WHERE 
    TO_DAYS(w1.recordDate) - TO_DAYS(w2.recordDate) = 1 AND
    w1.Temperature > w2.Temperature;