package de.nm.jdbc.ueb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import de.nm.jdbc.Util;

/**
 * Beispiel: Jdbc02ExecuteUpdate
 * 
 * @author <a href="mailto:mgn.schule@gmx.de">Michael Niedermair</a>
 * @version $Revision: 1117 $
 */
public class Jdbc02ExecuteUpdate {

   public static void main(final String[] args) {

      System.out.println("JDBC Execute Update");
      System.out.println("===================");

      Connection connection = null;
      Statement statement = null;

      try {

         // 1. Holen einer Connection
         connection = Util.getConnection("beispiel");

         // 2. Erzeugen eines Statements
         statement = connection.createStatement();

         // 3. Tabelle LIEFERANT loeschen, wenn diese vorhanden ist
         String sql1 = "DROP TABLE IF EXISTS LIEFERANT";
         int rowsUpdated = statement.executeUpdate(sql1);
         System.out.println(rowsUpdated);

         // 4. Tabelle LIEFERANT erstellen
         // CREATE TABLE LIEFERANT (
         // id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT,
         // name VARCHAR(255) NOT NULL,
         // created TIMESTAMP,
         // updated TIMESTAMP DEFAULT {ts '2013-01-01 01:00:00.0'}
         // );
         String sql2 ="CREATE TABLE LIEFERANT ("
         		+ "id INTEGER UNSIGNED PRIMARY KEY AUTO_INCREMENT, "
         		+ "name VARCHAR(255) NOT NULL, "
         		+ "created TIMESTAMP, "
         		+ "updated TIMESTAMP DEFAULT {ts '2013-01-01 01:00:00.0'});";
         
         rowsUpdated = statement.executeUpdate(sql2);
         System.out.println(rowsUpdated);

         // 5: Daten einfuegen
         // INSERT INTO LIEFERANT SET name="Niedermair";
         // INSERT INTO LIEFERANT SET name="Mueller";
         // INSERT INTO LIEFERANT SET name="Maier";
         statement.addBatch("INSERT INTO LIEFERANT SET name='Niedermair'");
         statement.addBatch("INSERT INTO LIEFERANT SET name='Mueller'");
         statement.addBatch("INSERT INTO LIEFERANT SET name='Maier'");

         int[] rowsu = statement.executeBatch();

      } catch (SQLException | ClassNotFoundException | IOException e) {
         System.out.println(e.getMessage());
         e.printStackTrace();
      } finally {
         // TODO statement schliessen
         // TODO connection schliessen
    	  Util.close(statement);
    	  Util.close(connection);
      }
   }
}
