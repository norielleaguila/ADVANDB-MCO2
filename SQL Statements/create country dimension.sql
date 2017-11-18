use teacher;

drop table if exists countrydimension;

create table countrydimension
    (
    countrykey int not null auto_increment,
        primary key (countrykey)
	) 
select 
	c.countrycode, c.countryname, substring_index(r.region, " & ", 1) region1, substring_index(region, " & ", -1) region2
from 
	advandb_mco2_wdi.country c natural join advandb_mco2_wdi.countryregion r;