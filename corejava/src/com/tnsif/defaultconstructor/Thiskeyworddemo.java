package com.tnsif.defaultconstructor;

public class Thiskeyworddemo {
	int rollno;     //actual parameters or class variable
	String name;    //data member
	
	Thiskeyworddemo(int rollno, String name) {// formal
		this.rollno=rollno;
		this.name=name;
	}
    public static void main(String[] args) {
    	Thiskeyworddemo f=new Thiskeyworddemo(1,"r");
    	System.out.println(f.name);
    	System.out.println(f.rollno);
    }
}
