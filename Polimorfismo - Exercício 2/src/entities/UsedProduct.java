package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");;
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	
	public String priceTag() {

		StringBuilder sb = new StringBuilder();

		sb.append("Product Name: " + this.name + "\n");
		sb.append("Product Price: $" + this.price + "\n");
		sb.append("Manufacture Date: " + sdf.format(this.manufactureDate) + "\n");

		return sb.toString();

	}

}
