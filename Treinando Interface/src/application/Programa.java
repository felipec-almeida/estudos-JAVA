package application;

import java.util.Locale;
import java.util.Scanner;

import models.entities.Quadrado;
import models.entities.Retângulo;
import models.entities.Triângulo;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
			System.out.println("<----- Informe os Dados da Figura ----->");
			System.out.print("Tipo da Figura (Quadrado, Retângulo e Triângulo): ");
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
				
				System.out.println("<----- Figura Selecionada: Retângulo ----->");
				
				System.out.print("Digite o Valor do Comprimento: ");
				double comprimento = sc.nextDouble();
				
				System.out.print("Digite o Valor da Largura: ");
				double largura = sc.nextDouble();
				
				System.out.print("Digite a Cor do Retângulo: ");
				String cor = sc.next();
				
				Retângulo retangulo = new Retângulo(cor, comprimento, largura);
				System.out.println(retangulo);
				
			} else if(resposta.charAt(0) == 'T' || resposta.charAt(0) == 't') {	
				
				System.out.println("<----- Figura Selecionada: Triângulo ----->");
				
				System.out.print("Digite o Valor da Base: ");
				double base = sc.nextDouble();
				
				System.out.print("Digite o Valor da Altura: ");
				double altura = sc.nextDouble();
				
				System.out.print("Digite a Cor do Triângulo: ");
				String cor = sc.next();
				
				Triângulo triangulo = new Triângulo(cor, base, altura);
				System.out.println(triangulo);
				
			}
			
		sc.close();

	}

}
