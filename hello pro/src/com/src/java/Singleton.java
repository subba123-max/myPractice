package com.src.java;

public class Singleton {
	public static Singleton obj;
	static {
		obj =new Singleton();
		System.out.println("Singleton obj created");
	}
	public static  Singleton getObj() {
		return obj;
	}
	

}
