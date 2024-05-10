package com.tnsif.applicationframework;

import com.tnsif.framework.Primeacc;

public class GSprimeacc extends Primeacc {

	public GSprimeacc(int accNo, String accName, float charges, boolean isprime) {
		super(accNo, accName, charges, isprime);

	}
	
	public void bookproduct(float charges) {
		System.out.println("Dear normal account user, your product chargers are:"+getCharges());
	}

	@Override
	public String toString() {
		return "GSprimeacc [isIsprime()=" + isIsprime() + ", toString()=" + super.toString() + ", getAccNo()="
				+ getAccNo() + ", getAccName()=" + getAccName() + ", getCharges()=" + getCharges() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
