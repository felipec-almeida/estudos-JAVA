package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {

	// Declaração das Variáveis da Classe:

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	/* private Calendar c = Calendar.getInstance(); */

	private Integer roomNumber;
	private Date checkin;
	private Date checkout;

	// Declaração dos Construtores da Classe (E Getters and Setters):

	public Reservation() {
		super();
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) throws DomainException {
		super();
	
		Date data = new Date();
		
		if(checkin.before(data)) {
			
			throw new DomainException("Erro - A data de Check-in deve ser Futura a data Atual.");
			
		} else if (checkin.after(checkout)) {
			
			throw new DomainException("Erro - A data de Check-in deve ser Anterior a data de Check-out.");
			
		}
		
		if(checkout.before(data)) {
			
			throw new DomainException("Erro - A data de Check-out deve ser Futura a data Atual.");
			
		} else if (checkout.before(checkin)) {
			
			throw new DomainException("Erro - A data de Check-out deve ser Futura a data de Check-in.");
			
		}
		
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	public Date getCheckin() {
		return checkin;
	}

	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}

	public Date getCheckout() {
		return checkout;
	}

	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	public Integer getRoomNumber() {
		
		return roomNumber;
		
	}

	// Declaração dos Métodos da Classe:

	public long duration() {

		long diff = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}

	public void updateDate(Date checkout) throws DomainException {
		
		if(checkout.before(checkin)) {
			
			throw new DomainException("Erro - A nova data de Check-out deve ser Futura a data de Check-in.");
			
		} 
		
		if (!checkout.after(checkout)) {
			
			throw new DomainException("Erro - A nova data de Check-out deve ser Futura a data de Check-out anterior.");
			
		}
		
		this.checkout = checkout;

	}

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Reservation: ");
		sb.append("Room " + this.roomNumber + ", ");
		sb.append("check-in date (dd/MM/yyyy): " + sdf.format(this.checkin) + ", ");
		sb.append("check-out date (dd/MM/yyyy): " + sdf.format(this.checkout) + ", ");
		sb.append(this.duration() + " nights");

		return sb.toString();

	}

}
