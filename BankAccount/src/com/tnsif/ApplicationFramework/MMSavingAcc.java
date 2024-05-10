package com.tnsif.ApplicationFramework;

import com.tnsif.FrameWork.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal, isSalaried);
		
	}
	public void withdraw(float accBal) {
		System.out.println("Dear current account user, your account MINBAL is:"+getAccBal());

	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSalaried()=" + isSalaried() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccName()=" + getAccName() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
