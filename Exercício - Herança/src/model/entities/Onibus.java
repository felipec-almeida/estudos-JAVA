package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Onibus extends Veiculo {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private int assentos;
	private Date revisao; 

	public Onibus() {
	}

	public Onibus(String placa, int ano, int assentos, Date revisao) {
		super(placa, ano);
		this.assentos = assentos;
		this.revisao = revisao;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public Date getRevisao() {
		return revisao;
	}

	public void setRevisao(Date revisao) {
		this.revisao = revisao;
	}

	@Override

	public String exibirDados() {

		StringBuilder sb = new StringBuilder();

		sb.append("<----- Dados do Onibus -----> \n");
		sb.append("Placa: " + getPlaca() + "\n");
		sb.append("Ano: " + getAno() + "\n");
		sb.append("Assentos: " + getAssentos() + "\n");
		sb.append("Última Revisão: " + sdf.format(getRevisao()));

		return sb.toString();

	}
}
