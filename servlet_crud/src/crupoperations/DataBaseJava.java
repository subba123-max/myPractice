package crupoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class DataBaseJava 
{
	public static int insertData(BatchFour insert)
	{
		int status=0;
		java.lang.String url = "jdbc:mysql://localhost:3306?user=root&password=ramcharan123";
		java.lang.String query = "insert into cfp.batchfour_info values(?,?,?,?)";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection =DriverManager.getConnection(url);
			PreparedStatement statement =connection.prepareStatement(query);
			
			statement.setString(1, insert.getEMP_NAME());
			statement.setString(2, insert.getEMP_ID());
			statement.setString(3, insert.getEMP_MAIL());
			statement.setString(4, insert.getPHONE_NUM());
			
			statement.executeUpdate();
			connection.close();
		} 
		catch (Exception e) 
		{
			
			e.printStackTrace();
		}
		return status;
	}
	
	public static void deleteData(BatchFour delete)
	{
//		String url = "jdbc:mysql://localhost:3306?user=root&password=ramcharan123";
//		String query = "delete from cfp.batchfour_info where EMP_ID=?";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=ramcharan123\"");
			PreparedStatement statement =connection.prepareStatement("delete from cfp.batchfour_info where EMP_ID=?");
			
			statement.setString(1, delete.getEMP_ID());
			
			statement.executeUpdate();
			
			connection.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/*public static BatchFour searchData(String EMP_ID)
	{
		BatchFour search = new BatchFour();
		
		String url = "jdbc:mysql://localhost:3306?user=root&password=12345";
		String query = "select * from cfp.batchfour_info where EMP_ID=?";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection =DriverManager.getConnection(url);
			PreparedStatement statement =connection.prepareStatement(query);
			
			statement.setString(1, search.getEMP_ID());
			
			ResultSet resultset = statement.executeQuery();
			
			while(resultset.next())
			{
				search.setEMP_ID(resultset.getString(1));
				search.setEMP_NAME(resultset.getString(2));
				search.setEMP_MAIL(resultset.getString(3));
				search.setPHONE_NUM(resultset.getString(4));
				
			}
			
			connection.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return search;
		
	}*/
	
	public static void updateData(BatchFour update)
	{
//		String url = "jdbc:mysql://localhost:3306?user=root&password=ramcharan123";
//		String query = "update cfp.batchfour_info set EMP_NAME=? where EMP_ID=?";
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=ramcharan123\"");
			PreparedStatement statement =connection.prepareStatement("update cfp.batchfour_info set EMP_NAME=? where EMP_ID=?");
			
			statement.setString(1, update.getEMP_NAME());
			//statement.setString(2, update.getPHONE_NUM());
			statement.setString(2, update.getEMP_ID());
			
			statement.executeUpdate();
			
			connection.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


}
