package com.src.java;

public class Test1 extends Test2 {
	int i=1000;
	void method() {
		System.out.println("I:"+i);
		i=super.i;
		System.out.println("I:"+i);

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Test1 t=	new Test1();
//		System.out.println(t.Test1(5));
	t.method(); 
		

	}

}
class Test2 {
	int i=5;
	void display() {
		System.out.println(i);
	}
}