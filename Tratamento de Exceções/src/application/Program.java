package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		metodoVetor();
		
		System.out.println("<----- .Programa Finalizado. ----->");

	}

	public static void metodoVetor() {
		
		Scanner sc = new Scanner(System.in);

		try {
			
			System.out.println("<----- Digite os itens que ser�o armazenados no Vetor ----->");
			
			String[] vetor = sc.nextLine().split(" ");

			System.out.println("<----- Digite a posi��o que deseja pesquisar ----->");
			int position = sc.nextInt();
			
			System.out.println("<----- Resultado ----->");

			System.out.println(vetor[position]);
			
			
		} catch(ArrayIndexOutOfBoundsException error) {
			
			System.err.append("Erro - Posi��o Solicitada Inv�lida! \n");
			System.out.print("Deseja Imprimir o Erro? (s/n) ");
			String resposta = sc.next();
			
			if(resposta.charAt(0) == 's' || resposta.charAt(0) == 'S') {
				
				error.printStackTrace();
				
			} else if(resposta.charAt(0) == 'n' || resposta.charAt(0) == 'N') {
				
				System.out.println("Prosseguindo...");
				
			}
			
		} catch(Exception error) {
			
			System.out.println("Erro - S� � permitido o uso de N�meros ao pesquisar!");
			System.out.print("Deseja Imprimir o Erro? (s/n) ");
			String resposta = sc.next();
			
			if(resposta.charAt(0) == 's' || resposta.charAt(0) == 'S') {
				
				error.printStackTrace();
				
			} else if(resposta.charAt(0) == 'n' || resposta.charAt(0) == 'N') {
				
				System.out.println("Prosseguindo...");
				
			}
			
		}

		sc.close();
		
	}

}
