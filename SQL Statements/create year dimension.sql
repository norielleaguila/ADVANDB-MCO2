use teacher;

drop table if exists yeard;
create table yeard
    (
    yearkey varchar(6) not null,
        primary key (yearkey)
	) 
select 
	substring(YearC, 7, 6) yearkey, substring(YearC, 7, 6) yearcode, substring(YearC, 1, 4) year
from 
	advandb_mco2_wdi.databyyear d
group by
	d.yearc;