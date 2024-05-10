package com.tnsif.MainMethod;

import com.tnsif.ApplicationFramework.MMBankFactory;
import com.tnsif.ApplicationFramework.MMCurrentAcc;
import com.tnsif.ApplicationFramework.MMSavingAcc;

public class User {
	
	public static void main(String[] args) {
		MMBankFactory obj=new MMBankFactory();
		
		//saving account creation
		MMSavingAcc ms=(MMSavingAcc)obj.getNewSavingAccount(13, "Rangdal", 450.4f, true);
		ms.withdraw(ms.getAccBal());
		
		//current account creation
		MMCurrentAcc mc=(MMCurrentAcc)obj.getNewCurrentAccount(11, "Nikitha", 450.4f, 65.2f);
		mc.withdraw(mc.getCreditLimit());
	}

}
