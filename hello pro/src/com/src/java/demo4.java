package com.src.java;

import java.util.Scanner;

public class demo4 {

	public static void main(String[] args) {

		A aobj = (A) new B();
//		B bobj = (B) new A();//class cast exception
//		C cobj=(C) aobj; //class cast exception

		String s2 = "HELLO";
		String s3 = s2.toUpperCase();
		System.out.println(s2 == s3);

		int[] arr = { 1, 2, 3 };
		int[] b = arr.clone();
		char[] c = { 'a', 'b', 'n' };

		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);

		
//			Set s=mapobjs.entrySet();
//			Iterator itr=s.iterator();
//			System.out.println("comparing hasmap objects using equa1s(): "+mapobjs.values());

//			while(itr.hasNext()) {
////				System.out.println("comparing hasmap objects using equa1s(): "+mapobjs.values().equals(empobj1));
//			}

	}

}

class A {

}

class B extends A {

}

class C extends B {

}