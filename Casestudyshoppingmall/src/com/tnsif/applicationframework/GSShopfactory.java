package com.tnsif.applicationframework;

import com.tnsif.framework.Normalacc;
import com.tnsif.framework.Primeacc;
import com.tnsif.framework.Shopfactory;

public class GSShopfactory implements Shopfactory {

	@Override
	public Primeacc getNewPrimeAccount(int accNo, String accName, float charges, boolean isprime) {
		Primeacc pa=new GSprimeacc(accNo,accName,charges,isprime);
		return pa;
		
	}

	@Override
	public Normalacc getNewNormalAccount(int accNo, String accName, float charges, float deliverycharges) {
		Normalacc na=new GSNormalacc(accNo,accName,charges,deliverycharges);
		return na;
	}

}
