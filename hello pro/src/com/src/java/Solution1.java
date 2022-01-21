package com.src.java;

import java.util.Scanner;

public class Solution1 {

	public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
class MyCalculator {

	public   int power(int n, int p) throws Exception {
		// TODO Auto-generated method stub
	int	res =0;
		if(n == 0 & p ==0) {
			throw new Exception("n and p not be zero");
		}else if(n<0 | p<0) {
			System.out.println("neg");
			throw new Exception("n and p should not be negative");
		}
		else {
			res=(int) Math.pow(n,p);
		}
		return res;
	}
    
    
}