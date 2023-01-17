package Exerc�cio2.model.entities;

import Exerc�cio2.enums.Canais;

public class Televis�o extends ControleRemoto {

	public Televis�o() {
		super();
	}

	public Televis�o(Integer volume, Canais canal) {
		super(volume, canal);
	}

	@Override
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
	
			sb.append("<----- Televis�o ----->");
			sb.append("Canal Atual -" + this.getCanal() + "\n");
			sb.append("Volume - " + this.getVolume() + "\n");
		
		return sb.toString();
		
	}
	
}
