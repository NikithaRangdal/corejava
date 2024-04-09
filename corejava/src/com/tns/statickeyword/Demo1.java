package com.tns.statickeyword;

public class Demo1 {
public static void main(String[] args) {
	Student.change();
		
	Student s1=new Student(1,"he");
	Student s2=new Student(2,"she");
	Student s3=new Student(3,"she's");
	Student s4=new Student(4,"he's");
		
	s1.display1();
	s2.display1();
	s3.display1();
	s4.display1();
	}
}
