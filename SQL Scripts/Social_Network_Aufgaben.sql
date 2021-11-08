use mysocialnetwork;

/*
    2. a)  Erstellen Sie daraus eine Liste von Personen-ID's, welche sich gegenseitig abonniert haben.
           Achten Sie darauf, dass jedes Paar nur einmal im Ergebnis steht.
*/
SELECT m1.M_id, m2.M_id FROM mitglied_abonniert m1 INNER JOIN mitglied_abonniert m2 on m1.Abonniert_id = m2.M_id;
