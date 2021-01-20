package Connection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import Connection.JDBCConnection;

public class JDBCConnection {
private static Connection conn = null;
	
	public static Connection getConnection() {
		
		try {
			
			if(conn == null) {

				Class.forName("oracle.jdbc.driver.OracleDriver");

				// environment variable approach
				return conn = DriverManager.getConnection(System.getenv("SQLurl"), System.getenv("SQLuser"), System.getenv("SQLpass"));	
			} 
			else {
				//return connection that exists
				return conn;
			}
			
		} catch (Exception e) { //catches all exceptions
			e.printStackTrace(); //prints all the exceptions caught
		}
		
		return null;
	}
}
