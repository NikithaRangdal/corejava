package com.tnsif.exception;
//exception with try and catch
public class Division {
	public static void divide() {
		int a=6, b=3,c;
		try {
			c=a/b;
			System.out.println("division"+c);
		}
		catch (ArithmeticException e) {
			System.out.println("didvision"+e.getMessage());;
		}
		catch (ArrayIndexOutOfBoundsException d) {
			System.out.println("division"+d.getMessage());
		}
		catch(Exception e) {
			System.out.println("welcome");
		}
	
	}
	public static void main(String[] args) {
		System.out.println("main method");
		Division.divide();
	}
}
