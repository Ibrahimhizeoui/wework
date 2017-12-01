package iwork.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import iwork.beans.Marker;
import iwork.beans.User;

public class MarkerDao implements Dao {
	Connection connect =Db_Connect.getInstance();
	@Override
	public Object create(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object update(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List list() {
		List<Marker> list=new ArrayList();
		String query = "SELECT * FROM `markers`";
		try {
			Statement stmt=(Statement) connect.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()){
				Marker s =new Marker();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAddress(rs.getString("address"));
				s.setLat(rs.getFloat("lat"));
				s.setLng(rs.getFloat("lng"));
				s.setType(rs.getString("type"));
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
	public Object find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
