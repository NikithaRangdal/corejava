package com.tnsif.multithreading;

public class Extendingthread extends Thread {
	
	public void run() {
		System.out.println("hello java");
	}
	public static void main(String[] args) {
		
		Extendingthread v=new Extendingthread(); //new stage
		
		v.start(); //runnable state
		
		System.out.println(v.getName());
		System.out.println(v.getPriority());
		System.out.println(v.isAlive());
	}

}
