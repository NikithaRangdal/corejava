package com.tnsif.stringsdemo;

public class Exampleimmutable {
public static void main(String[] args) {
	String str1="Nikitha";
	
	String str2=str1;
	String str3=str1;
	System.out.println("before modification");
	System.out.println("str1 "+str1);
	System.out.println("str1 "+str2);
	System.out.println("str1 "+str3);
	
	str1="Rangdal";
	
	System.out.println("after modification");
	
	System.out.println("str1 "+str1);
	System.out.println("str1 "+str2);
	System.out.println("str1 "+str3);
}
}
