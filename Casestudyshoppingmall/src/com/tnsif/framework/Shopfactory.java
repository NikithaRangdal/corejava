package com.tnsif.framework;

public interface Shopfactory {
	public Primeacc getNewPrimeAccount(int accNo,String accName,float charges,boolean isprime);
	public Normalacc getNewNormalAccount(int accNo,String accName,float charges,float deliverycharges);

}
