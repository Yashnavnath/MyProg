package com.springcore.Q14;

public class Rectangle implements Shape {
	
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	@Override
	public double area() {
	
		return length*width;
	}
	@Override
	public double side() {
	
		return 2*(length*width);
	}
	

}
