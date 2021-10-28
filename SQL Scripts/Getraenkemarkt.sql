use getraenkemarkt;

/* 1.
 * In welcher StraÃŸe (incl. Hausnummer) wohnt Frau Lorenz Sophia?
 */
SELECT strasse,
       hausnr
FROM mitarbeiter
WHERE name = 'Lorenz'
  AND vorname = 'Sophia';

/* 2.
 * Gesucht sind alle Informationen in der Mitarbeitertabelle von
 * Sonja Kaufmann und
 * Michael Woff.
 */
SELECT *
FROM mitarbeiter
WHERE name = 'Kaufmann'
    AND vorname = 'Sonja'
   OR name = 'Wolff'
    AND vorname = 'Michael';

/* 3.
 * Erstellen Sie eine alphabetisch sortierte Liste der Mitarbeiter
 * (Name und Vorname).
 * Dabei soll nach nach dem Nachnamen absteigend sortiert werden.
 * Bei gleichen Nachnamen soll aufsteigend nach dem Vornamen sortiert werden.
 */
SELECT name, vorname
FROM mitarbeiter
ORDER BY name ASC, vorname DESC;

/* 4.
 * Erstellen Sie eine Liste aller Mitarbeiter mit Name und Vorname.
 * Dabei soll zwischen Vor- und Nachname ein ", " gesetzt werden.
 * (Hinweis: CONCAT, SchlÃ¼sselwort AS in SELECT)
 */
SELECT CONCAT(name, ', ', vorname)
FROM mitarbeiter;

/* 5.
 * Welche Mitarbeiter (Id, Name und Vorname) wurden
 * vor dem 01.01.2005 eingestellt?
 */
SELECT id, name, vorname
FROM mitarbeiter
WHERE eingestellt < '2005-01-01';

/* 6.
 * Welche Mitarbeiter (Id, Name und Vorname) wurden
 * im Jahr 2006 eingestellt?
 */
SELECT id, name, vorname
FROM mitarbeiter
WHERE year(eingestellt) = 2006;

/* 7.
 * Welche Mitarbeiter (Id, Name und Vorname) wurden
 * im Jahr 2001 zwischen Januar und MÃ¤rz eingestellt?
 */
SELECT id, name, vorname
FROM mitarbeiter
WHERE year(eingestellt) = 2001
  AND month(eingestellt) >= 1
  AND month(eingestellt) <= 4;

/* 8. (a)
 * Gesucht ist eine Liste aller Mitarbeiter (Id, Name und Vorname)
 * und ihr dazugehÃ¶riges Alter.
 * Achten Sie darauf, dass dieser Befehl immer das richtige Alter bestimmt
 * und nicht vor dem AusfÃ¼hren angepasst werden muss.
 * (Hinweis: TIMESTAMPDIFF)
 */
SELECT id, name, vorname, TIMESTAMPDIFF(YEAR, geburtsdatum, CURRENT_TIMESTAMP) as 'Alter'
FROM mitarbeiter;

/* 8. (b)
 * Die Funktion TIMESTAMPDIFF gibt es nicht in allen SQL-Dialekten.
 * FolgenderBefehl fÃ¼r die Altersberechnung funktioniert unabhÃ¤ngig
 * fÃ¼r jeden SQL-Dialekt. Dabei wird verwendet,
 * dass der boolesche Wert fÃ¼r die Bedingung
 * intern als Zahl reprÃ¤sentiert wird
 * (1 = TRUE, 2 = FALSE ):
 *
 * SELECT
 *   id,
 *   name,
 *   vorname,
 *   YEAR(CURDATE()) - YEAR(geburtsdatum)
 *     - ( DATE_FORMAT(CURDATE(), '%m%d') < DATE_FORMAT(geburtsdatum, '%m%d') )
 *     AS 'Alter'
 * FROM
 *     mitarbeiter;
 *
 * Informieren Sie sich Ã¼ber den den Befehl DATE_FORMAT
 * und erklÃ¤ren Sie diese Altersberechnung.

    Antwort:
    Es wird die Differenz zwischen dem aktuellen Jahr, Monat, Tag und den Geburtsjahr, -monat, -tag berechnet.
 */

/* 8. (c)
 * Eine einfachere Berechnung fÃ¼r das Alter, die meistens genau genug ist,
 * ist folgender SQL-Befehl:
 *
 * SELECT
 *   id ,
 *   name,
 *   vorname,
 *   TRUNCATE( DATEDIFF( CURDATE() , geburtsdatum) / 365.25 , 0) AS 'Alter'
 * FROM
 *   mitarbeiter;
 *
 * Informieren Sie sich Ã¼ber die Befehle TRUNCATE und DATEDIFF
 * und erklÃ¤ren Sie die Altersberechnung.
 * Gehen Sie dabei auch auf die Zahl 365.25 ein.
 */


/*
 * Die Verkaufsabteilung hat von Ihrer erfolgreichen UnterstÃ¼tzung
 * der Personalabteilung und bittet Sie fÃ¼r folgende Informationen
 * nun ebenfalls um Hilfe.
 */


/* 1.
 * Erstellen Sie eine Liste aller Produkte,
 * die in der Bezeichnung das Wort â€žWeinâ€œ enthalten.
 * (Hinweis: SchlÃ¼sselwort LIKE)
 */
SELECT *
FROM produkt
WHERE bez LIKE '%wein%';

/* 2.
 * Ein Kunde aus DÃ¤nemark mÃ¶chte einen Ãœberblick Ã¼ber die Produkte.
 * Erstellen Sie eine Liste mit Produktbezeichnung und dem dazugehÃ¶rigen Preis.
 * Der Preis soll dabei in DÃ¤nische Kronen (DKK) umgerechnet
 * und angezeigt werden. Ausschnitt einer mÃ¶glichen Ausgabe:
 *
 *     +------------------------------+--------------+
 *     | bez                          | Preis in DKK |
 *     +------------------------------+--------------+
 *     | Augustiner Hell              |     145.0800 |
 *     | Red Bull                     |       5.9520 |
 *     | Rotwein Merlot               |      55.8000 |
 *     | Rotwein Shiraz               |      70.6800 |
 *     | Coca Cola                    |      18.6000 |
 *     | Wasser Gerolsteiner naturell |      78.1200 |
 *     +------------------------------+--------------+
 */
SELECT bez, preis * 7.446 as "Preis in DKK"
FROM produkt;

/* 3.
 * Gesucht sind alle Informationen Ã¼ber das billigste Produkt.
 * Gibt es etwas worauf bei der LÃ¶sung geachtet werden muss?
 */
SELECT *
FROM produkt
ORDER BY preis ASC
LIMIT 1;