/**
 * 
 */
package io.swagger.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import io.swagger.connectiondb.SingletonConnection;
import io.swagger.model.Project;

/**
 * @author revargas
 *
 */
public class ProjectDaoImp implements ProjectDao {
	
	private SingletonConnection conn;
	
	@Override
	public List<Project> getAllProjects() {
		List<Project> list = new ArrayList<Project>();
		Project p = null;
		Connection conn = SingletonConnection.getConnection();
		String sql = "SELECT * FROM dbprojecttu.projects";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				p = new Project();
				p.setIdProject(rs.getString("idProject"));
				p.setName(rs.getString("name"));
				p.setType(rs.getString("type"));
				p.setStatus(rs.getString("statusProject"));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
