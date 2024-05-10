package com.tnsif.ApplicationFramework;

import com.tnsif.FrameWork.BankFactory;
import com.tnsif.FrameWork.CurrentAcc;
import com.tnsif.FrameWork.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalaried) {
		SavingAcc sa=new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		CurrentAcc ca=new MMCurrentAcc(accNo, accNm, accBal,creditLimit);
		return ca;
	}

}
