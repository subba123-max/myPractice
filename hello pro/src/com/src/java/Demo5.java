package com.src.java;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Demo5 {

	public static void main(String[] args) {

		Employee empobj1 = new Employee(1, "ram", "ram@gmail.com");

		Employee empobj2 = new Employee(2, "ram", "ram@gmail.com");
		Employee empobj3 = new Employee(3, "bbb", "aa@gmail.com");

		System.out.println(empobj1.hashCode() + " ;" + empobj2.hashCode());

		System.out.println("using equals(): " + empobj1.equals(empobj2));
		System.out.println("using Comparable : " + empobj1.compareTo(empobj2));
		System.out.println("using Comparator: " + new Employee().compare(empobj2, empobj3));

		// s[0]*31^(n-1)+s[0]*31^(n-2)+--------+s[n-1]*31^(n-n)

		HashMap<Integer, Employee> mapobjs = new HashMap<>();
		mapobjs.put(1, empobj1);
		mapobjs.put(5, empobj2);
		mapobjs.put(3, empobj3);

		HashMap<Integer, Employee> mapobjs1 = new HashMap<>();
		mapobjs1.put(1, empobj1);
		mapobjs1.put(5, empobj2);
		mapobjs1.put(3, empobj3);
		System.out.println(mapobjs.equals(mapobjs1));
		
		

	}

}
