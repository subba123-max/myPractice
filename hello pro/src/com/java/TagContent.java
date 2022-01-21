package com.java;

import java.util.Scanner;
import java.util.regex.*;

public class TagContent {
	
	
public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			Pattern pat=Pattern.compile("<(.+)>([^<>]+)(</\\1>)");
			Matcher m=pat.matcher(line);
			int counter=0;
			while(m.find()) {
				if(m.group(2).length()!=0) {
					System.out.println(m.group(2));
					counter++;
				}
			}
			if(counter == 0) {
				System.out.println("None");
			}
			
			testCases--;
		}
		in.close();
	}

}
