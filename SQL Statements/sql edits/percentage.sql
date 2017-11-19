UPDATE teacherf
SET femalepercentage = (primaryfpercentage + secondaryfpercentage + tertiaryfpercentage) / 3
;

UPDATE teacherf
SET malepercentage = (primarympercentage + secondarympercentage + tertiarympercentage) / 3