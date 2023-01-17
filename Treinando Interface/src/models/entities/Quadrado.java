package models.entities;

import java.util.Formatter;

import models.interfaces.CalculoArea;

public class Quadrado implements CalculoArea {

	private String cor;
	private double lado1;
	private double lado2;
	
	public Quadrado() {
	}

	public Quadrado(String cor, double lado1, double lado2) {
		super();
		this.cor = cor;
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	@Override
	public double calculaArea() {
		
		return lado1 * lado2;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Cor: " + getCor() + "\n");
		sb.append("Lado 1: " + getLado1() + "\n");
		sb.append("Lado 2: " + getLado2() + "\n");
		sb.append("Área: " + String.format("%.2f", calculaArea()));
		return sb.toString();
		
	}

}
