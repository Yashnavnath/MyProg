package com.springcore.Q14;

public class Circle implements Shape {
	private double radius;
	
	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
	
		return Math.PI*radius*radius;
	}

	@Override
	public double side() {
		
		return 2*Math.PI*radius;
	}

}
