package com.tnsif.comparator;
import java.util.Comparator;


public class SortbyRoll implements Comparator<Students>{
	@Override
	public int compare(Students b1, Students b2) {
		
		return b2.rollno-b1.rollno;
	}

}