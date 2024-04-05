package com.tnsif.inheritance;
// to demonstrate inheritance
public class Citizen {
	private String name;
	private String address;
	private long aadhno;
	private long phno; // data members
	
	//default constructor
	public Citizen() {	
	}
	
	
    // parameter  const

	public Citizen(String name, String address, long aadhno, long phno) {
		super();
		this.name = name;
		this.address = address;
		this.aadhno = aadhno;
		this.phno = phno;
	}
	
    //getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAadhno() {
		return aadhno;
	}

	public void setAadhno(long aadhno) {
		this.aadhno = aadhno;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", address=" + address + ", aadhno=" + aadhno + ", phno=" + phno+ "]";
	}
	
}
