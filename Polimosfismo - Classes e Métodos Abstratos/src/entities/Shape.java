package entities;

import entities.enums.Color;

public abstract class Shape {

	protected Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		super();
		this.color = color;
	}

	public Double area() {
	
		return null;
		
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
		
	}
	
}
