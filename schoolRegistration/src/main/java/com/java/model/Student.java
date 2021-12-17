package com.java.model;

import javax.validation.constraints.*;

import com.java.validation.Agevalid;
import com.java.validation.Lnamevalid;
import com.java.validation.cityvalid;
import com.java.validation.namevalid;

public class Student {

		private int id;
//		@NotEmpty(message = "fname not be empty")
		@namevalid(message = "name is not Containing ha")
		private String fname;
		@Lnamevalid(message="all letters should be capital")
		private String lname;
//		@Min(value = 20 ,message = "min age shouid be 20")
//		@Max(value = 30 ,message = "max age shouid be 30")
//		@Agevalid(message="age must be between 8 to 20")
		private int age;
		
		@cityvalid(message = "it should end with pur")
		private String city;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + ", city=" + city + "]";
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
	

}
