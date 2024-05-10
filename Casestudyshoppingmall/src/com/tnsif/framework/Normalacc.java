package com.tnsif.framework;

public abstract class Normalacc extends Shopacc {
	
	private float deliverycharges;
	
	public void bookproduct(float charges) {
		
	}

	public Normalacc(int accNo, String accName, float charges, float deliverycharges) {
		super(accNo, accName, charges);
		this.deliverycharges = deliverycharges;
	}

	@Override
	public String toString() {
		return "Normalacc [deliverycharges=" + deliverycharges + "]";
	}

	public float getDeliverycharges() {
		return deliverycharges;
	}

	public void setDeliverycharges(float deliverycharges) {
		this.deliverycharges = deliverycharges;
	}
	

}
