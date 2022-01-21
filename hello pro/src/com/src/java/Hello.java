package com.src.java;

public class Hello {
	public static void main(String[] args) {
//		int sum=0;
//		for(int i=0,j=0;i<5&j<5;++i,j=i+1) {
//			
//			sum+=i;
//		}
//		System.out.println(sum);
		int a = 10;
		double b = 10.9;
		System.out.println("before modification a: " + a + "  b:" + b);
		new Hai().m1(a, b);
		System.out.println("after modification a: " + a + "  b:" + b);

	}
}

class Hai {
	int a;
	int b = 100;
	int c = 20;
	{
		c = 50;
	}

	void m1(int x, double y) {
		System.out.println("Inside m1() x:" + x + "  y:" + y);
		x++;
		y++;
		System.out.println("after modification in m1() x:" + x + "  y:" + y);
	}
}