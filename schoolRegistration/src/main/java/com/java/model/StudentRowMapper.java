package com.java.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper; 

public class StudentRowMapper implements RowMapper<Student>{

	public StudentRowMapper() {
		// TODO Auto-generated constructor stub
	}

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.setId(rs.getInt(1));
		stu.setFname(rs.getString(2));
		stu.setLname(rs.getString(3));
		stu.setAge(rs.getInt(4));
		stu.setCity(rs.getString(5));
		return stu;
	}

	

}
