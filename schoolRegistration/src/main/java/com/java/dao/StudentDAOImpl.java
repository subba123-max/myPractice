package com.java.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.java.model.Student;
import com.java.model.StudentRowMapper;

@Repository
public  class StudentDAOImpl implements StudentDAO {

	

		@Autowired
		private JdbcTemplate jdbcTemplate;

		
		public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
			this.jdbcTemplate = jdbcTemplate;
		}

		public void saveStudent(Student stud) {
			String sql="insert into student(fname,lname,age,city) values(?,?,?,?)";
			jdbcTemplate.update(sql,stud.getFname(),stud.getLname(),stud.getAge(),stud.getCity());
		
			
		}

		public List<Student> getAllUsers() {
		String sql="select * from student";
		List<Student> list=jdbcTemplate.query(sql, new StudentRowMapper());
			return list;
		}

		public Student getStudentByID(int id) {
		String sql="select * from student where id=?";
		Student stu=jdbcTemplate.queryForObject(sql,new StudentRowMapper(),id);
		System.out.println("stu"+stu);
			return stu;
		}

		public int updateStudent(Student student) {
			String sql="update student set fname=?,lname=?,age=?,city=? where id=?;";
			int stu=jdbcTemplate.update(sql,student.getFname(),student.getLname(),student.getAge(),student.getCity(),student.getId());
			return stu;
		}

		

}
