use teacher;

drop table if exists femalewage;

create table femalewage
    (
    countrycode varchar(3) not null, seriescode varchar(50) not null, yearC varchar(45) not null, datas double,
    
        primary key (countrycode, seriescode, yearC),
        
        foreign key(countrycode) references countryd(countrykey),
        foreign key(yearC) references yeard(yearkey)
	) 
select 
	countrycode as countrycode,
    seriescode as seriescode,
	substring(YearC, 7, 6) as yearC,
    Data as datas
from 
	advandb_mco2_wdi.databyyear
where
	seriescode LIKE 'SL.TLF.TOTL.FE.ZS';