package com.tnsif.framework;

public abstract class Shopacc {
	private int accNo;
	private String accName;
	private float charges;    //data members
	public Shopacc(int accNo, String accName, float charges) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.charges = charges;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	 abstract public  void bookproduct(float charges);
	@Override
	public String toString() {
		return "Shopacc [accNo=" + accNo + ", accName=" + accName + ", charges=" + charges + ", getAccNo()="
				+ getAccNo() + ", getAccName()=" + getAccName() + ", getCharges()=" + getCharges() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	 
	 

}
