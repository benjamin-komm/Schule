package de.nm.jdbc.ueb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import de.nm.jdbc.Util;

/**
 * Beispiel: Jdbc01Connect
 * 
 * @author <a href="mailto:mgn.schule@gmx.de">Michael Niedermair</a>
 * @version $Revision: 1525 $
 */
public class Jdbc01aConnect {

   @SuppressWarnings("unused")
   public static void main(final String[] args) throws ClassNotFoundException, IOException {

      System.out.println("JDBC Connection Test");
      System.out.println("====================");

      try {
    	  
    	  Connection connection = Util.getConnection("beispiel");
         

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

      } catch (SQLException e) {
         System.out.println("SQL-Fehler");
         e.printStackTrace();
      }
   }
}
