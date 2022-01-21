package com.src.java;

public class WordREV {

	public static void main(String[] args) {
		String s = rev.reverse("hello khan how are you");
		System.out.println(s);

	}

}

class rev {
	static String reverse(String s) {
		String res = "";

		if (s != null && s.isEmpty() != true && s.length() != 1) {
			String[] str = s.split(" ");

			for (int i = str.length - 1; i >= 0; i--) {

				res = res + str[i] + " ";
			}

		} else {

		}
		return res;
	}
}