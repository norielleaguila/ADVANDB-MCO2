UPDATE teacher.teacherf
INNER JOIN teacher.temp ON teacherf.countrykey = temp.countrycode AND teacherf.yearkey = temp.yearC
SET teacherf.primaryfpercentage = temp.datas
;

UPDATE teacher.teacherf
INNER JOIN teacher.temp ON teacherf.countrykey = temp.countrycode AND teacherf.yearkey = temp.yearC
SET teacherf.secondaryfpercentage = temp.datas
;

UPDATE teacher.teacherf
INNER JOIN teacher.temp ON teacherf.countrykey = temp.countrycode AND teacherf.yearkey = temp.yearC
SET teacherf.tertiaryfpercentage = temp.datas