package Exercício2.model.entities;

import Exercício2.enums.Canais;

public class ControleRemoto {

	protected Integer volume;
	protected Canais canal;

	public ControleRemoto() {
	}

	public ControleRemoto(Integer volume, Canais canal) {
		this.volume = volume;
		this.canal = canal;
	}

	public Canais getCanal() {
		return canal;
	}

	public void mudaCanal(int numero_canal) {

		switch (numero_canal) {

		case 1:
			this.canal = Canais.GLOBO;
			break;
		case 2:
			this.canal = Canais.SBT;
			break;
		case 3:
			this.canal = Canais.RECORD;
			break;
		case 4:
			this.canal = Canais.DISCOVERY;
			break;
		case 5:
			this.canal = Canais.DISCOVERY_KIDS;
			break;
		case 6:
			this.canal = Canais.TTC;
			break;
		case 7:
			this.canal = Canais.CARTOON_NETWORK;
			break;
		case 8:
			this.canal = Canais.MEGAPIX;
			break;

		}
	}

	public Integer getVolume() {
		return volume;
	}

	public int aumentaVolume() {

		return this.volume++;

	}

	public int abaixaVolume() {

		return this.volume--;

	}

}
