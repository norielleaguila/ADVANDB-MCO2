UPDATE 
	teacherf
INNER JOIN 
	femalewage ON 
	teacherf.countrykey = femalewage.countrycode AND 
    teacherf.yearkey = femalewage.yearC
SET 
	teacherf.femalepercentage = (femalepercentage / 100) * datas;