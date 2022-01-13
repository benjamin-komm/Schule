package de.nm.jdbc.ueb;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import de.nm.jdbc.Util;

/**
 * Beispiel: Jdbc03ExecuteQuery
 * 
 * @author <a href="mailto:mgn.schule@gmx.de">Michael Niedermair</a>
 * @version $Revision: 1117 $
 */
public class Jdbc03aExecuteQuery {

   public static void main(final String[] args) {

      System.out.println("JDBC Execute Query");
      System.out.println("==================");

      Connection connection = null;
      Statement statement = null;

      try {

         // 1. Holen einer Connection
         connection = Util.getConnection("beispiel");

         // 2. Erzeugen eines Statements
         statement = connection.createStatement();

         // 3. Struktur der Tabelle LIEFERANT anzeigen
         String sql1 = "SELECT * FROM LIEFERANT";
         ResultSet rs = statement.executeQuery(sql1);
         
         
         // 4. Metadatern ermitteln
         ResultSetMetaData meta = rs.getMetaData();
         int colmax = meta.getColumnCount();

         // 5. Resultset ausgeben
         while (rs.next()) {
        	 for (int i = 1; i <= colmax; ++i) {
				Object o = rs.getObject(i);
				
				System.out.print(o == null ?  "null" : o);
				System.out.print("\t");
			}
			System.out.println();
		}

      } catch (SQLException | ClassNotFoundException | IOException e) {
         System.out.println(e.getMessage());
         e.printStackTrace();
      } finally {
         Util.close(statement);
         Util.close(connection);
      }
   }
}
