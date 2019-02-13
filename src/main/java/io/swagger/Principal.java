/**
 * 
 */
package io.swagger;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import io.swagger.connectiondb.SingletonConnection;

/**
 * @author revargas
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = SingletonConnection.getConnection();
		String sql = "SELECT * FROM dbprojecttu.artifacts";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println("ID" + rs.getInt("idArtifact"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
