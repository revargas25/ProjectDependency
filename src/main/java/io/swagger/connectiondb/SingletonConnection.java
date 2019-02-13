/**
 * 
 */
package io.swagger.connectiondb;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

/**
 * @author revargas
 *
 */
public class SingletonConnection {
	private static Connection conn;
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbprojecttu?verifyServerCertificate=false&autoReconnect=true&useSSL=false", "projectTU", "tigoUne2018");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public static Connection getConnection() {
		return conn;
		
	}
}
