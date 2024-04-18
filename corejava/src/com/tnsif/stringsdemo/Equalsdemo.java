package com.tnsif.stringsdemo;

public class Equalsdemo {
	public static void main(String[] args) {
		String s1="Nikitha";
		String s2="NIKITHA";
		
		String s3=new String("Nikitha");
		String s4="suyog";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		//System.out.println(s1.equals(s4));
	}
}
