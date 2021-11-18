USE fb;

/*
    1.a)
*/
SELECT spieler.Name, DATEDIFF(current_date, spieler.GebDat) as 'Alter'
FROM spieler
ORDER BY `Alter`
LIMIT 1;