package com.java;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class JavaMap {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		HashMap<String, Long> map=new HashMap<String,Long>();
		System.out.println("----------Enter Data-------------");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) {
			String name=scan.next();
			long phone=scan.nextLong();
			map.put(name, phone);
			scan.nextLine();
		}
		System.out.println("-------Seacrh for data--------------");
		while(scan.hasNext())
		{
			String name=scan.nextLine();
			if(map.containsKey(name)) {
				System.out.println(name+" "+map.get(name));
			}else {
				System.err.println("not found");
			}
		}
		
		
				
	}

}
