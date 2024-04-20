package com.tnsif.comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		ArrayList<Students> al=new ArrayList<Students>();
		
		al.add(new Students(25,"niki","hyderabad"));
		al.add(new Students(24,"rangdal","secundrabad"));
		al.add(new Students(63,"rni","jillelaguda"));
		
		Collections.sort(al,new SortbyRoll());
		Collections.sort(al,new SortbyName());
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
