package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Loca��o;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
		Scanner sc = new Scanner(System.in);
		
			System.out.println("<----- Dados da Loca��o ----->");
			
			System.out.print("Modelo do Carro: ");
			String modelo_carro = sc.nextLine();
			
			System.out.print("Data de Retirada: ");
			String data_inicio = sc.nextLine();
			
			System.out.print("Data de Devolu��o: ");
			String data_final = sc.nextLine();
			
			System.out.print("Pre�o por Hora: ");
			Double preco_hora = sc.nextDouble();
			
			System.out.print("Pre�o por Dia: ");
			Double preco_dia = sc.nextDouble();
			
			try {
				
				Loca��o loc = new Loca��o(modelo_carro, sdf.parse(data_inicio), sdf.parse(data_final), preco_hora, preco_dia);
				System.out.println(loc);
				
			} catch(ParseException erro) {
				
				System.err.append("Erro ao Converter String para Data - " + erro.getMessage());
				
			}
			
		sc.close();
		
	}

}
