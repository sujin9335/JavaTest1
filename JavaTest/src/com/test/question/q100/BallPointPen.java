package com.test.question.q100;

public class BallPointPen {

	private double thickness;
	private String color;
	
	public double getThickness() {
		return thickness;
	}
	public void setThickness(double thickness) {
		
		this.thickness = thickness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "BallPointPen [thickness=" + thickness + ", color=" + color + "]";
	}
	
	
	
	
}
