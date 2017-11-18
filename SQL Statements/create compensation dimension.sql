use teacher;

drop table if exists compensationd;

create table compensationd
    (
    compensationkey int not null auto_increment, countrycode varchar(3) , compensationcode varchar(45), 
    compensationlevel varchar(100), compensationpercentile double, compensationdecile double, compensationquartile double, 
        primary key (compensationkey),
        foreign key (countrycode) references countryd(countrykey)
	) 
select 
	countrycode as countrycode,
	seriescode as compensationcode, 
    avg(data) as compensationpercentile,
    substring_index(substring_index(seriesname, ", ", -1), " (", 1) AS compensationlevel
from 
	((advandb_mco2_wdi.databyyear d natural join advandb_mco2_wdi.country)
    natural join advandb_mco2_wdi.series)
    natural join advandb_mco2_wdi.seriescategory
where
	seriescode LIKE 'SE.XPD.M%.ZS' 
group by 
	countrycode, compensationlevel;
	