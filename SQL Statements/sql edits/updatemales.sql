UPDATE teacherf
INNER JOIN malewage ON teacherf.countrykey = malewage.countrycode AND teacherf.yearkey = malewage.yearC
SET teacherf.malepercentage = (malepercentage / 100) * datas