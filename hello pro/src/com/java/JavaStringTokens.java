package com.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaStringTokens {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        s=s.trim();
	       if(!s.isEmpty()) {
	    	   String[] s1= s.split("[ !,?._'@]+");
		    	System.out.println(s1.length);

		       for(String s2:s1) {
		    	   System.out.println(s2);
		       }
		       
	       }else {
	    	   System.out.println(s.length());
	       }
	       
	      
	       
	        scan.close();

	}

}
