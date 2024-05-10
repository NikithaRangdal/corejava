package com.tnsif.FrameWork;

public abstract class CurrentAcc extends BankAcc {
	private float creditLimit;
	
    public void withdraw(float accBal) {
		
	}

	public CurrentAcc(int accNo, String accName, float accBal, float creditLimit) {
		super(accNo, accName, accBal);
		this.creditLimit = creditLimit;
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
    // G & S

	public float getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(float creditLimit) {
		this.creditLimit = creditLimit;
	}

	
	
	

}
