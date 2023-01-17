package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// Código:

		try {
			
		System.out.print("Room Number: ");
			
		int room_number = sc.nextInt();
		
		System.out.print("Check-in Date (dd/MM/yyyy): ");
		Date checkin = sdf.parse(sc.next());
		
		System.out.print("Check-out Date (dd/MM/yyyy): ");
		Date checkout = sdf.parse(sc.next());
		
		Reservation rs1 = new Reservation(room_number, checkin, checkout);
		
		System.out.println(rs1);
		
		System.out.println("<-------------------->");
		
		System.out.println("Enter Data to update the reservation: ");
		
		System.out.print("(New) Check-Out Date: ");
		 checkout = sdf.parse(sc.next());
		rs1.updateDate(checkout);
		
		System.out.println(rs1);
		
		sc.close();

		}
		catch(ParseException error) {
			
			System.err.append("Erro - Formato de Data Inválido (" + error + ")");
			
		} 
		catch (DomainException error) {
			
			System.err.append(error.getMessage());
			
		}
	
	}

}
