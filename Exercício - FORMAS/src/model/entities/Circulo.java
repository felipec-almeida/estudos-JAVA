package model.entities;

public class Circulo extends Figura {

	private double raio;

	public Circulo() {
		super();
	}

	public Circulo(String cor, double raio) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public double getDiametro() {

		return this.raio * 2.0;

	}

	public double area() {

		return Math.PI * Math.abs(raio);

	}

	@Override

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Dados do Círculo: Raio - " + getRaio());
		sb.append(" | Área - " + area());
		sb.append(" | Diâmetro - " + getDiametro());
		sb.append(" | Cor - " + getCor() + "\n");

		return sb.toString();

	}

}
