package com.tnsif.mainmethod;

import com.tnsif.applicationframework.GSNormalacc;
import com.tnsif.applicationframework.GSShopfactory;
import com.tnsif.applicationframework.GSprimeacc;

public class Client {
	public static void main(String[] args) {
		GSShopfactory obj=new GSShopfactory();
		
		//prime account creation
		GSprimeacc ga=(GSprimeacc)obj.getNewPrimeAccount(12, "nikitha", 500.7f, true);
		ga.bookproduct(ga.getCharges());
		
		//normal account creation
		GSNormalacc nr=(GSNormalacc)obj.getNewNormalAccount(13, "rangdal", 500.7f, 65.4f);
		nr.bookproduct(nr.getCharges());
	}

}
