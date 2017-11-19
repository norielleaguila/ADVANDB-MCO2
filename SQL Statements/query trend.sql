use teacher;

select
	region1, region2, avg(compensationpercentile) as 'compensation %', avg(femalepercentage + malepercentage) AS 'total %'
from
	teacherf natural join compensationd natural join countryd natural join yeard
group by
	region1;