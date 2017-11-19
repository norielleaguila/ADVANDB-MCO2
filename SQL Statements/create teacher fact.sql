use teacher;

drop table if exists teacherf;

create table teacherf
    (
    countrykey varchar(3) not null, compensationkey int not null, yearkey varchar(6) not null,
    femalepercentage double, malepercentage double, 
    primaryfpercentage double, secondaryfpercentage double, tertiaryfpercentage double,
    primarympercentage double, secondarympercentage double, tertiarympercentage double,
    
        primary key (countrykey, compensationkey, yearkey),
        
        foreign key(countrykey) references countryd(countrykey),
        foreign key(compensationkey) references compensationd(compensationkey),
        foreign key(yearkey) references yeard(yearkey)
	) 
select 
	countrycode as countrykey,
    compensationkey as compensationkey,
	substring(YearC, 7, 6) as yearkey
from 
	(((advandb_mco2_wdi.databyyear natural join advandb_mco2_wdi.country)
    natural join advandb_mco2_wdi.series)
    natural join advandb_mco2_wdi.seriescategory)
    natural join teacher.compensationd
where
	seriescode LIKE 'SE.%.TCHR.FE.ZS'
group by
	countrykey, yearkey;