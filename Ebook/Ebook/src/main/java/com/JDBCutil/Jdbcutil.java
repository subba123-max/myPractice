package com.JDBCutil;
import java.sql.*;
public class Jdbcutil {
	static {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException{
	Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demovirtusa","root","ramcharan123");
	return con;
	
	}
	
	public static void cleanup(Connection con,PreparedStatement ps) throws SQLException {
		if(con!=null)
			con.close();
		if(ps!=null)
			ps.close();
	}
	public static void cleanup(Connection con,PreparedStatement ps,ResultSet rs)   {
		try{if(con!=null)
			con.close();
		if(ps!=null)
			ps.close();
		if(rs!=null)
			rs.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
