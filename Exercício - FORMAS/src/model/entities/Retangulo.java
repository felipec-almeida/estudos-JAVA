package model.entities;

public class Retangulo extends Figura {

	protected double lado1;
	protected double lado2;
	
	public Retangulo() {
		super();
	}

	public Retangulo(String cor, double lado1, double lado2) {
		super(cor);
		this.lado1 = lado1;
		this.lado2 = lado2;
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

	public double area() {
		
		return this.lado1 * this.lado2;
		
	}
	
	@Override

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Dados do Retângulo: Lado 1 - " + getLado1());
		sb.append(" | Lado 2 - " + getLado2());
		sb.append(" | Área - " + area());
		sb.append(" | Cor - " + getCor() + "\n");

		return sb.toString();

	}

}
