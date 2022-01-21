package com.src.java;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = 1;

		while (scan.hasNext()) {
			String s = scan.nextLine();
			System.out.println(x + " " + s);
			x++;
		}

	}

}
