package model.entities;

public abstract class Figura {

	protected String cor;

	public Figura() {
	}

	public Figura(String cor) {

		this.cor = cor;

	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
