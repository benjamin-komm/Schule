use elektro_markt;

/*
 1. a) Unter welcher Filial-Telefonnummer kann man Frau Annika Burstedt erreichen?
 */
SELECT filiale.Telefon
FROM mitarbeiter,
     filiale
WHERE mitarbeiter.Vorname = 'Annika'
  AND mitarbeiter.Name = 'Burstedt'
  AND mitarbeiter.Filiale = filiale.Nr;

/*
 1. b) Welche Mitarbeiter arbeiten in einer Münchner-Filiale?
 */
SELECT mitarbeiter.Nr,
       mitarbeiter.Name,
       mitarbeiter.Vorname,
       mitarbeiter.Abteilung,
       mitarbeiter.Filiale,
       mitarbeiter.Vorgesetzter
FROM mitarbeiter
         INNER JOIN
     filiale ON mitarbeiter.Filiale = filiale.Nr
WHERE filiale.Ort LIKE 'München%'
ORDER BY mitarbeiter.Nr ASC;

/*
 1. c) Welcher Großhändler beliefert die Filiale in Augsburg?
 */
SELECT g.*
FROM grosshaendler g
         INNER JOIN beliefert b ON b.Haendler = g.Nr
         INNER JOIN Filiale f ON b.Filiale = f.Nr
WHERE f.Ort = 'Augsburg';

/*
 1. d) Gesucht sind Ansprechpartner und Telefonnummer des Großhändlers aus der
       Branche Haushalt , der die Filiale München-Süd beliefert.
 */
SELECT grosshaendler.Ansprechpartner, grosshaendler.Tel
FROM grosshaendler
         INNER JOIN beliefert ON grosshaendler.Nr = beliefert.Haendler
         INNER JOIN filiale ON beliefert.Filiale = filiale.Nr
WHERE grosshaendler.Branche = 'Haushalt'
  AND filiale.Ort LIKE '%nchen-S%';

/*
 1. e) Ermitteln Sie alle Informationen derjenigen Filialen, die von keinem Großhändler beliefert werden.
 */
SELECT filiale.*
FROM filiale
         LEFT JOIN beliefert ON filiale.Nr = beliefert.Filiale
WHERE beliefert.Filiale IS NULL;

/*
 1. f) Geben Sie Name und Vorname des direkten Vorgesetzten von Mitarbeiter Lars Becker an.
 */
SELECT m2.Name, m2.Vorname
FROM mitarbeiter m1
         INNER JOIN mitarbeiter m2 ON m1.Vorgesetzter = m2.Nr
WHERE m1.Name = 'Becker'
  AND m1.Vorname = 'Lars';

/*
 1. g) Erstellen Sie eine Liste aller Mitarbeiter (Name, Vorname) mit einer neuen Spalte Direkter Vorgesetzter
       in der Vor- und Nachname des Vorgesetzten von jedem Mitarbeiter steht. Besitzt ein Mitarbeiter keinen
       Vorgesetzten, soll der Eintrag leer sein.
 */
SELECT m1.Name, m1.Vorname, COALESCE(CONCAT(m2.Vorname, ' ', m2.Name), '') as 'Direkter Vorgesetzer'
FROM mitarbeiter m1
         LEFT JOIN mitarbeiter m2 ON m1.Vorgesetzter = m2.Nr;

