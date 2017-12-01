package iwork.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Db_Connect {


	private static String url ="jdbc:mysql://localhost/wework";
	private static String user = "root";
	private static String passwd = "";
	private static Connection connect;
	public static Connection getInstance(){
	if(connect == null){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("worked");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			connect=DriverManager.getConnection(url,user,passwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return connect;
	}

}
