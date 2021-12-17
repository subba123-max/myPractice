package com.java.dao;

import java.util.List;

import com.java.model.Student;

public interface StudentDAO {
	public void saveStudent(Student stud);
	public List<Student> getAllUsers();
	public Student getStudentByID(int id);
	public int updateStudent(Student student);
}
