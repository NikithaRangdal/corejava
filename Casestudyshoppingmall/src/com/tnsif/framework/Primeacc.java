package com.tnsif.framework;

public abstract class Primeacc extends Shopacc {
	
	private boolean isprime;
	private static final float deliverycharge=0;
	
	//getter and setter
	public boolean isIsprime() {
		return isprime;
	}
	public void setIsprime(boolean isprime) {
		this.isprime = isprime;
	}
	public static float getDeliverycharge() {
		return deliverycharge;
	}
	
	@Override
	public String toString() {
		return "Primeacc [isprime=" + isprime + ", isIsprime()=" + isIsprime() + "]";
	}
	
	public Primeacc(int accNo, String accName, float charges, boolean isprime) {
		super(accNo, accName, charges);
		this.isprime = isprime;
	}
	
	public void bookproduct(float charges) {
		
	}
	
	
	

}
