package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Caminhao extends Veiculo {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private double capacidade_carga;
	private int eixos;
	private Date revisao;
	
	public Caminhao() {
	}

	public Caminhao(String placa, int ano, double capacidade_carga, int eixos, Date revisao) {
		super(placa, ano);
		this.capacidade_carga = capacidade_carga;
		this.eixos = eixos;
		this.revisao = revisao;
	}

	public double getCapacidade_carga() {
		return capacidade_carga;
	}

	public void setCapacidade_carga(double capacidade_carga) {
		this.capacidade_carga = capacidade_carga;
	}

	public int getEixos() {
		return eixos;
	}

	public void setEixos(int eixos) {
		this.eixos = eixos;
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

		sb.append("<----- Dados do Caminhão -----> \n");
		sb.append("Placa: " + getPlaca() + "\n");
		sb.append("Ano: " + getAno() + "\n");
		sb.append("Capacidade de Carga (KG): " + getCapacidade_carga() + "kg \n");
		sb.append("Eixos: " + getEixos() + "\n");
		sb.append("Última Revisão: " + sdf.format(getRevisao()));

		return sb.toString();

	}

}
