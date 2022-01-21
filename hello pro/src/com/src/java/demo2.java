package com.src.java;

public class demo2 {
	public static void main(String[] args) {
		// pass by reference

		Test t = new Test();
		int[] arr = { 10, 20, 30 };
		System.out.println("before");
		for (int i : arr)
			System.out.println(i);
		t.m1(arr);
		System.out.println("after ");
		for (int i : arr)
			System.out.println(i);

		int n = 7;
		int result ;
		for (int ii = 1; ii <= 10; ii++) {
			result = n * ii;
			System.out.println(n + " * " + ii + " = " + result);
		}

	}
}

class Test {
	int a;
	int b = 100;
	int c = 20;
	{
		c = 50;
	}

	void m1(int[] x) {
		System.out.println("Inside m1() x:");
		for (int a : x)
			System.out.println(a);
		x[0] = 100;
		x[1] = 200;
		x[2] = 300;
		System.out.println("after modification in m1() x:");
		for (int a : x)
			System.out.println(a);
	}
}