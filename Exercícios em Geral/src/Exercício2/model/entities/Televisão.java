package Exercício2.model.entities;

import Exercício2.enums.Canais;

public class Televisão extends ControleRemoto {

	public Televisão() {
		super();
	}

	public Televisão(Integer volume, Canais canal) {
		super(volume, canal);
	}

	@Override
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
	
			sb.append("<----- Televisão ----->");
			sb.append("Canal Atual -" + this.getCanal() + "\n");
			sb.append("Volume - " + this.getVolume() + "\n");
		
		return sb.toString();
		
	}
	
}
