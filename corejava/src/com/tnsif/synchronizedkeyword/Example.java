package com.tnsif.synchronizedkeyword;
// synchronized demo

public class Example {
	
	void display() {
		Thread g=Thread.currentThread();
		
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(g.getName()+" "+i);
			}
			catch(Exception e) {
				
			}
		}
	}

}
