package models.entities;

import models.interfaces.CalculoArea;

public class Triângulo implements CalculoArea{

	private String cor;
	private double base;
	private double altura;
	
	public Triângulo() {
	}

	public Triângulo(String cor, double base, double altura) {
		super();
		this.cor = cor;
		this.base = base;
		this.altura = altura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		
		return (base * altura) / 2.0;
		
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Cor: " + getCor());
		sb.append("Lado 1: " + getBase());
		sb.append("Lado 2: " + getAltura());
		sb.append("Área: " + String.format("%.2f", calculaArea()) + "\n");
		return sb.toString();
		
	}
	
}
