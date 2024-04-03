package com.tnsif.scannerprogram;

import java.util.Scanner;

public class Personexce {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
	System.out.println("enter person name");
	String n=sc.nextLine();
	System.out.println("enter the income");
	int i=sc.nextInt();

		
	Person pl=new Person();
	pl.setName(n);
	pl.setIncome(i);
	Taxcal c=new Taxcal();
	c.caluculatetax(pl);
	System.out.println("after calucation");
	System.out.println(pl);	
	}
	

}

