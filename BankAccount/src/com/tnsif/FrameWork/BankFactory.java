package com.tnsif.FrameWork;

public interface BankFactory {
	public SavingAcc getNewSavingAccount(int accNo,String accName,float accBal,boolean isSalaried);
	public CurrentAcc getNewCurrentAccount(int accNo,String accName,float accBal,float creditLimit);


}
