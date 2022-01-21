package com.java;

import java.util.Scanner;

public class UserNameValidator {
	private static final  String regularExpression="^[A-Za-z]\\w{7,9}$";

private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UserNameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }

}
