package com.tnsif.superkeyword;

public class Superchild extends Supervariable {
	
	int a=7;
	void display1() {
		System.out.println(a);
		System.out.println(super.a);
	}
	void drink() {
		System.out.println("coffee");
	}
	void display() {
		drink();
		super.drink();
	}
	
	public static void main(String[] args) {
		Superchild c=new Superchild();
		c.drink();
		c.display();
	}

}
