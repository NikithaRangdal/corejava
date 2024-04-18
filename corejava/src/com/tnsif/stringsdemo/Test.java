package com.tnsif.stringsdemo;

public class Test {
	public static void main(String[] args) {
		String s1=" Nikitha";
		String s2="Nikitha";
		String s3="Nikitha ";
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
	}
}
