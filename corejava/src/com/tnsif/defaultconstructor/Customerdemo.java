package com.tnsif.defaultconstructor;

import java.util.Scanner;

public class Customerdemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your name");
	String n=sc.nextLine();
	System.out.println("enter your id");
	int i=sc.nextInt();
	System.out.println("enter your name of the city");
	String s=sc.nextLine();
	
	Customer c=new Customer();
	
	c.setCustomername(n);
	c.setCustomerid(i);
	c.setCustomercity(s);
	
	System.out.println(c);
	
	boolean t= c instanceof Customer;
	System.out.println(t);

}
}
