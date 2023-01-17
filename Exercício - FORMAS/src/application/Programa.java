package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Circulo;
import model.entities.Quadrado;
import model.entities.Retangulo;
import model.entities.Triangulo;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			System.out.println("<----- Dados da Figura ----->");
			System.out.print("Qual é o tipo da figura? (Quadrado - Retângulo - Triângulo - Circulo) ");
			String resposta_figura = sc.next();
			
			if(resposta_figura.charAt(0) == 'Q' || resposta_figura.charAt(0) == 'q') {
				
				System.out.println("Figura Selecionada: " + resposta_figura);
				System.out.println("<----- Informações da Figura ----->");
				
				System.out.print("Lado 1: ");
				double lado1 = sc.nextDouble();
				
				System.out.print("Lado 2: ");
				double lado2 = sc.nextDouble();
				
				System.out.print("Cor: ");
				String cor = sc.next();
				
				Quadrado q = new Quadrado(cor, lado1, lado2);
				
				System.out.println(q);
				
			} else if(resposta_figura.charAt(0) == 'R' || resposta_figura.charAt(0) == 'r') {
				
				System.out.println("Figura Selecionada: " + resposta_figura);
				System.out.println("<----- Informações da Figura ----->");
				
				System.out.print("Lado 1: ");
				double lado1 = sc.nextDouble();
				
				System.out.print("Lado 2: ");
				double lado2 = sc.nextDouble();
				
				System.out.print("Cor: ");
				String cor = sc.next();
				
				Retangulo r = new Retangulo(cor, lado1, lado2);
				
				System.out.println(r);
				
			} else if(resposta_figura.charAt(0) == 'T' || resposta_figura.charAt(0) == 't') {
				
				System.out.println("Figura Selecionada: " + resposta_figura);
				System.out.println("<----- Informações da Figura ----->");
				
				System.out.print("Base: ");
				double base = sc.nextDouble();
				
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				
				System.out.print("Cor: ");
				String cor = sc.next();
				
				Triangulo t = new Triangulo(cor, base, altura);
				System.out.println(t);
				
			} else if(resposta_figura.charAt(0) == 'C' || resposta_figura.charAt(0) == 'c') {
				
				System.out.println("Figura Selecionada: " + resposta_figura);
				System.out.println("<----- Informações da Figura ----->");
				
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				
				System.out.print("Cor: ");
				String cor = sc.next();
				
				Circulo c = new Circulo(cor, raio);
				System.out.println(c);
			
			} else {
				
				System.err.append("Erro ao Selecionar a Figura, verifique se escreveu corretamente e tente novamente.");
				
			}
			
		sc.close();

	}

}
