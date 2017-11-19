DELETE FROM teacherf
WHERE	countrykey = ANY
		(
		SELECT countrykey
		FROM (
			SELECT countrykey, COUNT(countrykey) as num
			FROM teacherf
			GROUP BY countrykey
			 ) as alpha
		WHERE alpha.num < 5
		)
;

DELETE FROM teacherf
WHERE countrykey = ANY
	(
     SELECT countrykey
     FROM
     (
		SELECT countrykey, COUNT(countrykey) as num
		FROM malewage
		INNER JOIN teacherf ON malewage.countrycode = teacherf.countrykey AND malewage.yearC = teacherf.yearkey
		GROUP BY countrykey
	 ) as alpha
     WHERE alpha.num < 5
    )