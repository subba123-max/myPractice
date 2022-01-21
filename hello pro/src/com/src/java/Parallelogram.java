package com.src.java;

import java.util.Scanner;

public class Parallelogram {

	static boolean flag = false;
	static int B;
	static int H;
	static {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("enter data:");
			B = scan.nextInt();
			H = scan.nextInt();

			if (B > 0 && H > 0) {

				flag = true;

			} else {
				throw new Exception("Breadth and height must be positive");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}

	}

}
