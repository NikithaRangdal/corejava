package com.tnsif.abstraction;
//child class
public class Square extends Shape {
	
	private float side; //data member or variable
	
	public Square() {
		side=4.6f;
	}

	@Override
	void calarea() {
		super.area=side*side;
		
		
	}

}
