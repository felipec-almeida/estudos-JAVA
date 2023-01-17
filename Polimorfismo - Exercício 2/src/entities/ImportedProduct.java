package entities;

public class ImportedProduct extends Product {

	private Double customsFee; 
	
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		
		return this.price += this.customsFee;
		
	}
	
	@Override
	
	public String priceTag() {

		StringBuilder sb = new StringBuilder();

		sb.append("Product Name: " + this.name + "\n");
		sb.append("Product Price: $" + this.totalPrice());
		sb.append(" (Customs Fee: $" + this.customsFee + ") \n");

		return sb.toString();

	}

}
