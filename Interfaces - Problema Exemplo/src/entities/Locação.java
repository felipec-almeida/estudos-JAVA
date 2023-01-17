package entities;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import services.Calculo;

public class Locação implements Calculo{

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
	private Calendar c = Calendar.getInstance();
	
	private String modeloCarro;
	private Date dataInicio;
	private Date dataFinal;
	private Double precoPorHora;
	private Double precoPorDia;
	
	public Locação() {
	}

	public Locação(String modeloCarro, Date dataInicio, Date dataFinal, Double precoPorHora, Double precoPorDia) {
		
		this.modeloCarro = modeloCarro;
		this.dataInicio = dataInicio;
		this.dataFinal = dataFinal;
		this.precoPorHora = precoPorHora;
		this.precoPorDia = precoPorDia;
		
	}

	public String getModeloCarro() {
		return modeloCarro;
	}

	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Date dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Double getPrecoPorHora() {
		return precoPorHora;
	}

	public void setPrecoPorHora(Double precoPorHora) {
		this.precoPorHora = precoPorHora;
	}

	public Double getPrecoPorDia() {
		return precoPorDia;
	}

	public void setPrecoPorDia(Double precoPorDia) {
		this.precoPorDia = precoPorDia;
	}

	public static SimpleDateFormat getSdf() {
		return sdf;
	}
	
	public Integer duracao() {
		
		c.setTime(dataInicio);
		int hora_inicial = c.get(Calendar.HOUR);
		
		c.setTime(dataFinal);
		int hora_final = c.get(Calendar.HOUR);
		
		return hora_final - hora_inicial;
		
	}
	
	public Double pagamento_básico() {
		
		int hora = this.duracao();
		
		return precoPorHora * hora;
		
	}
	
	public Double taxa() {
		
		return pagamento_básico() * 0.15;
		
	}
	
	public Double total() {
		
		return pagamento_básico() + taxa();
		
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
			sb.append("Pagamento Básico: " + this.pagamento_básico() + "\n");
			sb.append("Taxa: " + this.taxa() + "\n");
			sb.append("Total: " + this.total());
		
		return sb.toString();
		
	}
	
}
