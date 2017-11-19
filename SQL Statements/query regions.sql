use teacher;

select
	region1, avg(compensationpercentile) as 'compensation %', 
    avg((primaryfpercentage / 100 * femalepercentage) + (primarympercentage / 100 * malepercentage)) AS 'primary %',
    avg((secondaryfpercentage / 100 * femalepercentage) + (secondarympercentage / 100 * malepercentage)) AS 'secondary %',
    avg((tertiaryfpercentage / 100 * femalepercentage) + (tertiarympercentage / 100 * malepercentage)) AS 'tertiary %'
from
	teacherf natural join compensationd natural join countryd natural join yeard
group by
	region1;