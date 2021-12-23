/*
    1.1)
*/
SELECT S_ID, Name, Vorname, Geschlecht, Gehalt_monatl
FROM spieler;

/*
    1.2)
*/
SELECT Name, Vorname, GebDat
FROM spieler
ORDER BY Name, Vorname ASC;

/*
    1.3)
*/
SELECT CONCAT(Name, ', ', Vorname), GebDat
FROM spieler
ORDER BY Name, Vorname ASC;

/*
    1.4)
*/
SELECT LENGTH(CONCAT(Name, ' ', Vorname))
FROM spieler;

/*
    1.5)
*/
SELECT Ort
FROM ort
WHERE LEFT(PLZ, 1) = 8;

/*
    1.6)
*/
SELECT Ort
FROM ort
WHERE ort LIKE 'K%'
   or ort LIKE 'L%'
   or ort LIKE 'M%'
   or ort LIKE 'N%';

/*
    1.7)
*/
SELECT Name, Vorname, Gehalt_monatl
FROM spieler
WHERE Gehalt_monatl >= 600000;

/*
    1.8)
*/
SELECT Name, Vorname, Ruecken_Nr
FROM spieler
WHERE Ruecken_Nr = 1;

/*
    1.9)
*/
SELECT Name as "FC Vereine"
FROM verein
WHERE Name LIKE '%FC%';

/*
    2.1)
*/
SELECT COUNT(V_ID) as 'Anzahl Vereine'
FROM verein;

/*
    2.2)
*/
SELECT COUNT(S_ID) as 'Spieleranzahl mit der Nummer 1'
FROM spieler
WHERE Ruecken_Nr = 1;

/*
    2.3)
*/
SELECT SUM(Gehalt_monatl) as 'Gesamtes Gehalt'
FROM spieler;

/*
    2.4)
*/
SELECT SUM(Gehalt_monatl) as 'Gesamtes Gehalt von Spielern mit der Nummer 1'
FROM spieler
WHERE Ruecken_Nr = 1;

/*
    2.5)
*/
SELECT MAX(Gehalt_monatl) as 'Maximales Gehalt',
       MIN(Gehalt_monatl) as 'Minimales Gehalt',
       AVG(Gehalt_monatl) as 'Durschschnitsgehalt'
FROM spieler;

/*
    2.6)
*/
