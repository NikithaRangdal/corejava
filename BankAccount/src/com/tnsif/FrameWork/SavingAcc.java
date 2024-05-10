package com.tnsif.FrameWork;

public abstract class SavingAcc extends BankAcc {
	private boolean isSalaried;
	private static final float MINBAL=0;
	
	//G & S
	public boolean isSalaried() {
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) {
		this.isSalaried = isSalaried;
	}
	public static float getMinbal() {
		return MINBAL;
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	public SavingAcc(int accNo, String accName, float accBal, boolean isSalaried) {
		super(accNo, accName, accBal);
		this.isSalaried = isSalaried;
	}
	
    public void withdraw(float accBal) {
		
	}

	

}
