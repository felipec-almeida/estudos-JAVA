package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Enter the number of Products: ");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("<-------------------->");
			
			System.out.println("Product #" + i + " data: ");
			
			System.out.print("Common, Used or Imported? (c/u/i) ");
			String resposta  = sc.next();
			
			System.out.print("Name: ");
			String name = sc.next();
			
			sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(resposta.charAt(0) == 'C' || resposta.charAt(0) == 'c') {
				
				list.add(new Product(name, price));
				
			} else if (resposta.charAt(0) == 'U' || resposta.charAt(0) == 'u') {
				
				System.out.print("Manufacture Date: ");
				String manufactureDate = sc.next();
				list.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
				
			} else if (resposta.charAt(0) == 'I' || resposta.charAt(0) == 'i') {
				
				System.out.print("Customs Fee:");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				
			}
			
		}
		
		System.out.println("<----- Price Tags ----->");
		for(Product p : list) {
			
			System.out.println(p.priceTag());
			
		}
		
		sc.close();

	}

}
	
