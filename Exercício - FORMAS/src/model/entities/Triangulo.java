package model.entities;

public class Triangulo extends Figura {

	private double base;
	private double altura;

	public Triangulo() {
		super();
	}

	public Triangulo(String cor, double base, double altura) {
		super(cor);
		this.base = base;
		this.altura = altura;
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

	public double area() {

		return (this.altura * this.base) / 2.0;

	}

	@Override

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Dados do Triângulo: Base - " + getBase());
		sb.append(" | Altura - " + getAltura());
		sb.append(" | Área - " + area());
		sb.append(" | Cor - " + getCor() + "\n");

		return sb.toString();

	}

}
