package iwork.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import iwork.beans.Job;
import iwork.beans.User;

public class UserDao implements Dao<User>{

	Connection connect =Db_Connect.getInstance();
	@Override
	public User create(User obj) {
		String query="INSERT INTO `users` (`id`, `name`, `email`, `password`, `type_user`, `remember_token`, `created_at`, `updated_at`)"
				+ " VALUES (NULL, ?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement  prepdStmt = connect.prepareStatement(query);
			prepdStmt.setString(1, obj.getName());
			prepdStmt.setString(2, obj.getMail());
			prepdStmt.setString(3, obj.getPassword());
			prepdStmt.setString(4, obj.getType_user());
			prepdStmt.setString(5, null);
			
			prepdStmt.setTimestamp(6, obj.getCreated_at());
			prepdStmt.setTimestamp(7, obj.getUpdated_at());
			
			prepdStmt.execute(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return obj;
	}

	@Override
	public User update(User obj) {
		String query ="UPDATE `users` SET "
				+ "`name` = ?, "
				+ "`email` = ?, "
				+"`type_user` = ?"
				+ "`updated_at` = ? WHERE "
				+ "`users`.`id` = ?";
		try {
			PreparedStatement  prepdStmt = connect.prepareStatement(query);
			prepdStmt.setString(1, obj.getName());
			prepdStmt.setString(2, obj.getMail());
			prepdStmt.setString(3, obj.getType_user());
			prepdStmt.setTimestamp(4, obj.getCreated_at());
			prepdStmt.setTimestamp(5, obj.getUpdated_at());
			prepdStmt.setInt(5, obj.getId());
			
			prepdStmt.execute(); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		List<User> list=new ArrayList();
		String query = "SELECT * FROM `users`";
		try {
			Statement stmt=(Statement) connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				User s =new User();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setMail(rs.getString("email"));
				s.setType_user(rs.getString("type_user"));
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
	public User find(int id) {
		User s =new User();
		String query = "SELECT * FROM `users`";
		try {
			Statement stmt=(Statement) connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setMail(rs.getString("email"));
				s.setType_user(rs.getString("type_user"));
				s.setCreated_at(rs.getTimestamp("created_at"));
				s.setUpdated_at(rs.getTimestamp("updated_at"));
				System.out.println(s.toString());
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return s;
	}

	@Override
	public boolean delete(int id) {
		String query="DELETE FROM `users` WHERE `id`="+id;
		
		 
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
