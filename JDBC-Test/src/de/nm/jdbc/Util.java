package de.nm.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {

    private static Connection connection = null;

    public static Connection getConnection(final String db) throws SQLException, ClassNotFoundException, IOException {
        if (Util.connection == null) {
            Properties properties = new Properties();
            properties.load(new FileReader("config/" + db + ".properties"));

            String driver = properties.getProperty("DBDRIVER");
            String url = properties.getProperty("DBURL");
            String user = properties.getProperty("DBUSER");
            String password = properties.getProperty("DBPW");

            Class.forName(driver);
            Util.connection = DriverManager.getConnection(url, user, password);
        }
        return Util.connection;
    }

}
