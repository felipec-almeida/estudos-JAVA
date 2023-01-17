package models.entities;

import models.interfaces.CalculoArea;

public class Ret�ngulo implements CalculoArea {

	private String cor;
	private double comprimento;
	private double largura;
	
	public Ret�ngulo() {
	}
	
	public Ret�ngulo(String cor, double comprimento, double largura) {
		this.cor = cor;
		this.comprimento = comprimento;
		this.largura = largura;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	@Override
	public double calculaArea() {
		
		return comprimento * largura;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Cor: " + getCor());
		sb.append("Lado 1: " + getComprimento());
		sb.append("Lado 2: " + getLargura());
		sb.append("�rea: " + String.format("%.2f", calculaArea()) + "\n");
		return sb.toString();
		
	}

}
