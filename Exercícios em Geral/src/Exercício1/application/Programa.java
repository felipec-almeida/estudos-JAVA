package Exercício1.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import Exercício1.entities.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
			System.out.println("<----- Dados da Pessoa ----->");
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Data de Nascimento: ");
			String data = sc.next();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			try {
				
				Pessoa pessoa = new Pessoa(nome, sdf.parse(data), altura);
				System.out.println("<----- Resultados ----->");
				System.out.println(pessoa);
				
			} catch(ParseException erro) {
				
				erro.getStackTrace();
				
			}
			
		sc.close();

	}

}
