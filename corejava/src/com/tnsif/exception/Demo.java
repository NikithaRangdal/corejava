package com.tnsif.exception;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno");
		int rollno=sc.nextInt();
		if(rollno<0) {
			throw new ArithmeticException("roll no cant be negative");
		}
		else {
			System.out.println("valid rollnumber");
		}

	}
}
