package com.src.java;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaSHA256 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(getSHAHEX(s));
		sc.close();
	}

	private static String getSHAHEX(String s) {
		StringBuffer sb = new StringBuffer();
		try {
			MessageDigest msg = MessageDigest.getInstance("SHA-256");
			byte[] result = msg.digest(s.getBytes());
			for (int i = 0; i < result.length; i++) {
				String hex = Integer.toHexString(0xff & result[i]);
//				Integer.toHexString(r)
				System.out.println("HEX"+hex);
				if (hex.length() == 1)
					sb.append('0');
				sb.append(hex);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return sb.toString();
	}

}
