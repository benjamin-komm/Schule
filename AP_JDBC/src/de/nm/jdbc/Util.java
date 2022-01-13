package de.nm.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Util {
	
	private static Connection connection = null;
	
	private static String dbdriver;
	private static String dburl;
	private static String dbuser;
	private static String dbpw;
	
	public static Connection getConnection(final String db) throws SQLException, ClassNotFoundException, IOException{
		
		Properties prop = new Properties();
		//prop.load(new FileReader("D:\\Echlipse Workspace\\AP_JDBC\\properties\\" + db + ".properties"));
		prop.load(new FileReader("properties\\" + db + ".properties"));
		setDbdriver(prop.getProperty("DBDRIVER"));
		setDburl(prop.getProperty("DBURL"));
		setDbuser(prop.getProperty("DBUSER"));
		setDbpw(prop.getProperty("DBPW"));
		
		setConnection(DriverManager.getConnection(
       		 getDburl(), getDbuser(), getDbpw()));
		
		return getCreatedConnection();
		
	}
	
	public static void close(final AutoCloseable obj) {
		
		try {
			obj.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static String getDbdriver() {
		return dbdriver;
	}

	public static void setDbdriver(String dbdriver) {
		Util.dbdriver = dbdriver;
	}

	public static String getDburl() {
		return dburl;
	}

	public static void setDburl(String dburl) {
		Util.dburl = dburl;
	}

	public static String getDbuser() {
		return dbuser;
	}

	public static void setDbuser(String dbuser) {
		Util.dbuser = dbuser;
	}

	public static String getDbpw() {
		return dbpw;
	}

	public static void setDbpw(String dbpw) {
		Util.dbpw = dbpw;
	}

	public static Connection getCreatedConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		Util.connection = connection;
	}
	
	
	
	
}
