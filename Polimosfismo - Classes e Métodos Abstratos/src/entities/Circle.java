package entities;

import entities.enums.Color;

public class Circle extends Shape {

	private static final Double pi = 3.14;
	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	public static Double getPi() {
		return pi;
	}

	@Override

	public Double area() {

		return pi * Math.pow(2, radius);

	}

	@Override
	
	public String toString() {

		StringBuilder sb = new StringBuilder();

			sb.append("Area of the Circle: " + this.area());
			
		return sb.toString();

	}

}
