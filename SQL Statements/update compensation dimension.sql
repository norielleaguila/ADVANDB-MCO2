UPDATE  teacher.compensationd
SET compensationquartile = 4
WHERE compensationpercentile <= 100;
    
UPDATE  teacher.compensationd
SET compensationquartile = 3
WHERE compensationpercentile <= 75;

UPDATE  teacher.compensationd
SET compensationquartile = 2
WHERE compensationpercentile <= 50;

UPDATE  teacher.compensationd
SET compensationquartile = 1
WHERE compensationpercentile <= 25;

UPDATE  teacher.compensationd
SET compensationdecile = 10
WHERE compensationpercentile <= 100;

UPDATE  teacher.compensationd
SET compensationdecile = 9
WHERE compensationpercentile <= 90;

UPDATE  teacher.compensationd
SET compensationdecile = 8
WHERE compensationpercentile <= 80;

UPDATE  teacher.compensationd
SET compensationdecile = 7
WHERE compensationpercentile <= 70;

UPDATE  teacher.compensationd
SET compensationdecile = 6
WHERE compensationpercentile <= 60;

UPDATE  teacher.compensationd
SET compensationdecile = 5
WHERE compensationpercentile <= 50;

UPDATE  teacher.compensationd
SET compensationdecile = 4
WHERE compensationpercentile <= 40;

UPDATE  teacher.compensationd
SET compensationdecile = 3
WHERE compensationpercentile <= 30;

UPDATE  teacher.compensationd
SET compensationdecile = 2
WHERE compensationpercentile <= 20;

UPDATE  teacher.compensationd
SET compensationdecile = 1
WHERE compensationpercentile <= 10;