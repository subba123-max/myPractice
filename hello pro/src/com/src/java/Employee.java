package com.src.java;

import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
	private int id;
	private String ename;
	private String email;

	public Employee() {
		super();
	}

	@Override
	public int hashCode() {

		return this.id;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Employee) {
			Employee emp = (Employee) obj;
//			System.out.println("ename:" + emp);
			return this.id == emp.id && this.ename.equals(emp.ename) && this.email.equals(emp.email);
		}
		return false;
	}

	public Employee(int id, String ename, String email) {
		super();
		this.id = id;
		this.ename = ename;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", email=" + email + "]";
	}

//	@Override
//	public int compareTo(Employee emp) {
//		if (this.id < emp.id )
//			return -1;
//		if (this.id > emp.id )
//			return 1;
//		return 0;
//
//	}

	@Override
	public int compareTo(Employee emp) {
		if (this.ename.hashCode() < emp.ename.hashCode())
			return -1;
		if (this.ename.hashCode() > emp.ename.hashCode())
			return 1;
		return 0;

	}

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if (emp1.ename.hashCode() < emp2.ename.hashCode())
			return -1;
		if (emp1.ename.hashCode() > emp2.ename.hashCode())
			return 1;
		return 0;
	}

}
