package com.src.java;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

public class Reflection {
	public static void main(String[] args) throws ClassNotFoundException{
           Class student = new Student().getClass();
           Method[] methods = student.getDeclaredMethods();

           ArrayList<String> methodList = new ArrayList<>();
           for(Method m : methods){
               methodList.add(m.getName());
           }
           Collections.sort(methodList);
           for(String name: methodList){
               System.out.println(name);
           }
       }

}

class Student {
	private String name;
	private String id;
	private String email;

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void anothermethod1() {
	}

	public void anothermethod2() {
	}

	public void anothermethod3() {
	}

	public void anothermethod4() {
	}

	public void anothermethod5() {
	}

}