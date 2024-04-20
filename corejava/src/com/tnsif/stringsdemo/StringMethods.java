package com.tnsif.stringsdemo;
//String methods
public class StringMethods {
	public static void main(String[] args) {
		String str=new String("hello");
		
		System.out.println(str);
		str=str.concat("  rangdal  ");
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.indexOf("h"));
		System.out.println(str.charAt(11));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());
	}
}
