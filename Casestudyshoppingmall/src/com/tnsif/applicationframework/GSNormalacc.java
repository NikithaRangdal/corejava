package com.tnsif.applicationframework;

import com.tnsif.framework.Normalacc;

public class GSNormalacc extends Normalacc {

	public GSNormalacc(int accNo, String accName, float charges, float deliverycharges) {
		super(accNo, accName, charges, deliverycharges);
	}
	
	public void bookproduct(float charges) {
		System.out.println("Dear normal account user, your product chargers are:"+getCharges()+" delivery chargers"+getDeliverycharges());
	}

	@Override
	public String toString() {
		return "GSNormalacc [toString()=" + super.toString() + ", getDeliverycharges()=" + getDeliverycharges()
				+ ", getAccNo()=" + getAccNo() + ", getAccName()=" + getAccName() + ", getCharges()=" + getCharges()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}
