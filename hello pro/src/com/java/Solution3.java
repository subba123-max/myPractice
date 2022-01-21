package com.java;

import java.util.*;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}


public class Solution3 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		Collections.sort(studentList, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Student s1 = (Student) o1;
				Student s2 = (Student) o2;
				if (s1.getCgpa() == s2.getCgpa()) {
					if (s1.getFname().equalsIgnoreCase(s2.getFname())) {
						System.out.println("id");
						return s1.getId() - s2.getId();
					}
					System.out.println("name");
					return s1.getFname().compareTo(s2.getFname());

				} else {
					System.out.println("cgpa");
					return (int) ( s2.getCgpa() * 100 - s1.getCgpa() * 100);
				}

			}
		});

//		Collections.sort(studentList, new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				Student s1 = (Student) o1;
//				Student s2 = (Student) o2;
//				if (s1.getCgpa() == s2.getCgpa()) {
//					if (s1.getFname().equals(s2.getFname())) {
//						return s1.getId() - s2.getId();
//					} else {
//						return s1.getFname().compareTo(s2.getFname());
//					}
//
//				} else {
//					return (int) (s2.getCgpa() * 1000 - s1.getCgpa() * 1000);
//				}
//			}
//
//		});
		
		

		for (Student st : studentList) {
			System.out.println(st.getFname() + " " + st.getId());
		}
	}
}
