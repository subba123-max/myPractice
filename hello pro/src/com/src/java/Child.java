package com.src.java;

public class Child  extends parent{
	void msg() throws ArithmeticException{System.out.println("child");};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new Child();
		try {
			p.msg();
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
class parent{
	void msg() throws Exception{System.out.println("parent");};
}