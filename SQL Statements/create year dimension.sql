use teacher;

drop table if exists yeardimension;
create table yeardimension
    (
    yearkey int not null auto_increment,
        primary key (yearkey)
	) 
select 
	substring(YearC, 7, 6) yearcode, substring(YearC, 1, 4) year
from 
	advandb_mco2_wdi.databyyear;