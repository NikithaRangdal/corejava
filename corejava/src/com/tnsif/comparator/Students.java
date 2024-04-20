package com.tnsif.comparator;
//comparator
public class Students {
	int rollno;
	String name;
	String address;    // data members
	public Students(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

}