package com.tnsif.FrameWork;

public abstract class BankAcc {
	private int accNo;
	private String accName;
	private float accBal; //data members
	public BankAcc(int accNo, String accName, float accBal) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accBal = accBal;
	}
	//getter and setters
	
	

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

	public float getAccBal() {
		return accBal;
	}

	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accName=" + accName + ", accBal=" + accBal + ", getAccNo()=" + getAccNo()
				+ ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	abstract public  void withdraw(float accBal);
	

}
