package com.tnsif.comparator;
import java.util.Comparator;


public class SortbyName implements Comparator<Students> {
	@Override
	public int compare(Students b1, Students b2) {
		
		return b1.name.compareTo(b2.name);
	}

}