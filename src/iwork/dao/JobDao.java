package iwork.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import iwork.beans.Job;



public class JobDao implements Dao<Job> {
	Connection connect =Db_Connect.getInstance();
	@Override
	public Job create(Job obj) {
		String query="INSERT INTO `jobs` (`id`, `title`, `type`, `description`, `budget`, `state`, `duration`, `user_id`, `created_at`, `updated_at`)"
				+ " VALUES (NULL, ?, ?,?, ?, ?, ?, ?, ?,?)";
		try {
			PreparedStatement prepdStmt = connect.prepareStatement(query);
			prepdStmt.setString(1, obj.getTitle());
			prepdStmt.setString(2, obj.getType());
			prepdStmt.setString(3, obj.getDescription());
			prepdStmt.setDouble(4, obj.getBudjet());
			prepdStmt.setBoolean(5, obj.isState());
			prepdStmt.setString(6, obj.getDuration());
			prepdStmt.setInt(7, 1);
			prepdStmt.setTimestamp(8, obj.getCreated_at());
			prepdStmt.setTimestamp(9, obj.getUpdated_at());
			
			prepdStmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}

	@Override
	public Job update(Job obj) {
		
		// TODO Auto-generated method stubSt
		String query="UPDATE `jobs` SET "
				+ "`title` = ?, "
				+ "`type` = ?, "
				+ "`description` = ?, "
				+ "`budget` = ?, "
				+ "`state` = ?, "
				+ "`duration` = ?, "
				+ "`updated_at` = ? "
				+ "WHERE `jobs`.`id` = ?";
		try {
			PreparedStatement prepdStmt = connect.prepareStatement(query);
			prepdStmt.setString(1, obj.getTitle());
			obj.setTitle(obj.getTitle());
			prepdStmt.setString(2, obj.getType());
			obj.setType(obj.getType());
			prepdStmt.setString(3, obj.getDescription());
			obj.setDescription( obj.getDescription());
			prepdStmt.setDouble(4, obj.getBudjet());
			obj.setBudjet( obj.getBudjet());
			prepdStmt.setBoolean(5, obj.isState());
			obj.setState(obj.isState());
			prepdStmt.setString(6, obj.getDuration());
			obj.setDuration(obj.getDuration());
			prepdStmt.setTimestamp(7, obj.getUpdated_at());
			obj.setUpdated_at( obj.getUpdated_at());
			
			prepdStmt.setInt(8, obj.getId());
			
			prepdStmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}

	@Override
	public List<Job> list() {
		List<Job> list=new ArrayList();
		String query = "SELECT * FROM `jobs`";
		try {
			Statement stmt=(Statement) connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				Job s =new Job();
				s.setId(rs.getInt("id"));
				s.setTitle(rs.getString("title"));
				s.setType(rs.getString("type"));
				s.setDescription(rs.getString("description"));
				s.setBudjet(rs.getDouble("budget"));
				s.setState(rs.getBoolean("state"));
				s.setDuration(rs.getString("duration"));
				s.setId_user_client(rs.getInt("user_id"));
				s.setCreated_at(rs.getTimestamp("created_at"));
				s.setUpdated_at(rs.getTimestamp("updated_at"));
				
				
				System.out.println(s.toString());
				list.add(s);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return list;
	}

	@Override
	public Job find(int id) {
		Job s =new Job();
		String query ="SELECT * FROM `jobs` WHERE `id`="+id;
		try {
			Statement stmt=(Statement) connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				
				s.setId(rs.getInt("id"));
				s.setTitle(rs.getString("title"));
				s.setType(rs.getString("type"));
				s.setDescription(rs.getString("description"));
				s.setBudjet(rs.getDouble("budget"));
				s.setState(rs.getBoolean("state"));
				s.setDuration(rs.getString("duration"));
				s.setId_user_client(rs.getInt("user_id"));
				s.setCreated_at(rs.getTimestamp("created_at"));
				s.setUpdated_at(rs.getTimestamp("updated_at"));
				
				
				System.out.println(s.toString());
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		return s;
	}

	@Override
	public boolean delete(int id) {
		String query="DELETE FROM `jobs` WHERE `id`="+id;
		
		 
		try {
			Statement stmt = (Statement) connect.createStatement();
		    stmt.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return true;
	}

}
