-- 코드를 작성해주세요
WITH Ranked_Ecoli AS (
    SELECT ID, SIZE_OF_COLONY,
           NTILE(4) OVER (ORDER BY SIZE_OF_COLONY DESC) AS Colony_Rank
    FROM ECOLI_DATA
)
SELECT ID,
       CASE 
           WHEN Colony_Rank = 1 THEN 'CRITICAL'
           WHEN Colony_Rank = 2 THEN 'HIGH'
           WHEN Colony_Rank = 3 THEN 'MEDIUM'
           WHEN Colony_Rank = 4 THEN 'LOW'
       END AS COLONY_NAME
FROM Ranked_Ecoli
ORDER BY ID;