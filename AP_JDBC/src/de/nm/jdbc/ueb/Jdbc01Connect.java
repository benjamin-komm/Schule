package de.nm.jdbc.ueb;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Beispiel: Jdbc01Connect
 * 
 * @author <a href="mailto:mgn.schule@gmx.de">Michael Niedermair</a>
 * @version $Revision: 1525 $
 */
public class Jdbc01Connect {

   public static void main(final String[] args) {

      System.out.println("JDBC Connection Test");
      System.out.println("====================");

      try {

         // 1. Laden des JDBC Treibers fuer MySQL
         // mysql-connector-java-{version}-bin.jar muss zur Laufzeit im
         // classpath sein!

    	  
    	  
         /*
          * TODO
          */
         Class.forName("com.mysql.cj.jdbc.Driver");

         System.out.println("MySQL JDBC-Treiber geladen!");

         // 2. Oeffnen einer Connection zur DB
         Connection connection = DriverManager.getConnection(
        		 "jdbc:mysql://localhost:3306/fb?allowMultiQueries=true", "user1", "password1");
         /*
          * TODO
          */

         if (connection != null) {
            System.out.println("Connection erfolgreich aufgebaut!");
         } else {
            System.out.println("Connection konnte nicht aufgebaut werden!");
            return;
         }

         // 3. Lesen von Metadaten der DB:
         DatabaseMetaData dbmd = connection.getMetaData();
         System.out.println("Metadaten der Datenbank:");
         System.out.println("DB          :" + dbmd.getDatabaseProductName());
         System.out.println("Version     :" + dbmd.getDatabaseProductVersion());
         System.out.println("Treiber     :" + dbmd.getDriverName());
         System.out.println("Treiber V   :" + dbmd.getDriverVersion());
         System.out.println("MaxIndexLen :" + dbmd.getMaxIndexLength());

         // 4. Schliessen der Connection
         if (connection != null && !connection.isClosed()) {
            connection.close();
            System.out.println("Connection wurde wieder geschlossen!");
         }

      } catch (ClassNotFoundException e) {
         System.out.println("MySQL JDBC-Treiber nicht gefunden!\n");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("SQL-Fehler");
         e.printStackTrace();
      }
   }
}
