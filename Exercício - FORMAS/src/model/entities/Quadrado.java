package model.entities;

public class Quadrado extends Retangulo {

	public Quadrado() {
		super();
	}

	public Quadrado(String cor, double lado1, double lado2) {
		super(cor, lado1, lado2);
	}
	
	@Override

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Dados do Quadrado: Lado 1 - " + getLado1());
		sb.append(" | Lado 2 - " + getLado2());
		sb.append(" | Área - " + area());
		sb.append(" | Cor - " + getCor() + "\n");

		return sb.toString();

	}
	
}
