package application;

import java.util.Locale;
import java.util.Scanner;

import models.entities.Quadrado;
import models.entities.Ret�ngulo;
import models.entities.Tri�ngulo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
			System.out.println("<----- Informe os Dados da Figura ----->");
			System.out.print("Tipo da Figura (Quadrado, Ret�ngulo e Tri�ngulo): ");
			String resposta = sc.nextLine();
			
			if(resposta.charAt(0) == 'Q' || resposta.charAt(0) == 'q') {	
				
				System.out.println("<----- Figura Selecionada: Quadrado ----->");
				
				System.out.print("Digite o Valor do Lado 1: ");
				double lado1 = sc.nextDouble();
				
				System.out.print("Digite o Valor do Lado 2: ");
				double lado2 = sc.nextDouble();
				
				sc.nextLine();
				
				System.out.print("Digite a Cor do Quadrado: ");
				String cor = sc.next();
				
				sc.nextLine();
				
				Quadrado quadrado = new Quadrado(cor, lado1, lado2);
				System.out.println(quadrado);
				
			} else if(resposta.charAt(0) == 'R' || resposta.charAt(0) == 'r') {	
				
				System.out.println("<----- Figura Selecionada: Ret�ngulo ----->");
				
				System.out.print("Digite o Valor do Comprimento: ");
				double comprimento = sc.nextDouble();
				
				System.out.print("Digite o Valor da Largura: ");
				double largura = sc.nextDouble();
				
				System.out.print("Digite a Cor do Ret�ngulo: ");
				String cor = sc.next();
				
				Ret�ngulo retangulo = new Ret�ngulo(cor, comprimento, largura);
				System.out.println(retangulo);
				
			} else if(resposta.charAt(0) == 'T' || resposta.charAt(0) == 't') {	
				
				System.out.println("<----- Figura Selecionada: Tri�ngulo ----->");
				
				System.out.print("Digite o Valor da Base: ");
				double base = sc.nextDouble();
				
				System.out.print("Digite o Valor da Altura: ");
				double altura = sc.nextDouble();
				
				System.out.print("Digite a Cor do Tri�ngulo: ");
				String cor = sc.next();
				
				Tri�ngulo triangulo = new Tri�ngulo(cor, base, altura);
				System.out.println(triangulo);
				
			}
			
		sc.close();

	}

}
