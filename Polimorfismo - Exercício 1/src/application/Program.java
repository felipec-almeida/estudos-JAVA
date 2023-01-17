package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of Employees: ");
		int n = sc.nextInt();
		
		System.out.println();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			
			System.out.println("<---------- Dads ---------->");
			
			System.out.println();
			
			System.out.println("Employee #" + i + " data: ");
			
			System.out.print("Outsourced (y/n)? ");
			String resposta = sc.next();
			
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			
			System.out.print("Value Per Hour: ");
			double valuePerHour = sc.nextDouble();
			
			if(resposta.charAt(0) == 'Y' || resposta.charAt(0) == 'y') {
				
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				
				list.add(new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge));
				
			} else if(resposta.charAt(0) == 'N' || resposta.charAt(0) == 'n') {
				
				list.add(new Employee(name, hours, valuePerHour));
				
			}
			
		}
		
		System.out.println();
		
		System.out.println("<---------- Payments ---------->");
	
		for(Employee employee : list) {
			
			System.out.println(employee);
			
		}
		
		System.out.println();

		sc.close();
		
	}
	
}
