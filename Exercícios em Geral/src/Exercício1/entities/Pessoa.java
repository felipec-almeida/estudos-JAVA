package Exercício1.entities;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Pessoa {

	private String nome;
	private Date data;
	private Calendar c = Calendar.getInstance();
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private double altura;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, Date data, double altura) {
		
		this.nome = nome;
		this.data = data;
		this.altura = altura;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public int getIdade() {
		
		int ano_atual = c.get(Calendar.YEAR);
		
		c.setTime(data);
		int ano_nascimento = c.get(Calendar.YEAR);
		
		return ano_atual - ano_nascimento;
		
	}
	
	@Override
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
			sb.append("Nome - " + getNome());
			sb.append(" | Data de Nascimento - " + sdf.format(getData()));
			sb.append(" | Altura - " + getAltura());
			sb.append(" | Idade - " + getIdade() + " anos \n");
		
		return sb.toString();
		
	}
	
}
