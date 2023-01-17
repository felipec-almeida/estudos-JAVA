package entities;

public class OutSourcedEmployee extends Employee {
	
	private Double additionalCharge;

	public OutSourcedEmployee() {
		super();
	}

	public OutSourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override 
	
	public Double payment() {
		
		Double additional = this.additionalCharge * 1.1;
		
		return (this.valuePerHour * this.hours) + additional;
		
	}

}
