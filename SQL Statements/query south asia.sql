use teacher;

select
	region1, region2, avg(compensationpercentile) as 'compensation %', avg(femalepercentage + malepercentage) AS 'total %', year
from
	teacherf natural join compensationd natural join countryd natural join yeard
group by
	region1, region2, year
having
	region1 = 'East Asia';