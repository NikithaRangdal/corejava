package com.tnsif.stringsdemo;
import java.util.ArrayList;
//add
//size
//contains
//isempty

public class Demo {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		System.out.println("size"+l.size());
		l.add(43);
		l.add("nikitha");
		l.add(3.7f);
		l.add(6);
		l.add('n');
		System.out.println("size"+l.size());
		System.out.println(l.contains(55));
		System.out.println(l.isEmpty());
		System.out.println(l.get(1));
		System.out.println(l.remove(4));
		System.out.println("size"+l.size());
		System.out.println(l);
		
	}
}
