package com.tnsif.ApplicationFramework;

import com.tnsif.FrameWork.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal, creditLimit);
		
	}
	public void withdraw(float accBal) {
		System.out.println("Dear current account user, your account MINBAL is :"+getAccBal()+" creditLimit :"+getCreditLimit());
		
	}
	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getCreditLimit()=" + getCreditLimit()
				+ ", getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
