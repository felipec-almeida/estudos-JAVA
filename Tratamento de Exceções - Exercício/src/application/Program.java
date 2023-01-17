package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Formulário:
		
		try { 
			
			System.out.println("<----- Entre os Dados da Conta ----->");
			
			System.out.print("Número da Conta: ");
			Integer numero_conta = sc.nextInt();
			
			System.out.print("Nome do Titular: ");
			sc.nextLine();
			String nome_titular = sc.nextLine();
			
			System.out.print("Saldo Inicial: ");
			Double saldo = sc.nextDouble();
			
			System.out.print("Limite de Saque: ");
			Double limite_saque = sc.nextDouble();
			
			//Declaração do Objeto Account: 
				
			Account acc = new Account(numero_conta, nome_titular, saldo, limite_saque);
			
			System.out.println();
			System.out.println("<----- Dados Bancários da Conta ----->");
			System.out.println(acc);
			
			System.out.println();
			System.out.println("<----- Saque ------>");
			
			System.out.print("Digite um valor para Sacar: ");
			Double valor = sc.nextDouble();
			acc.withdraw(valor);
			
			System.out.println();
			System.out.println("<----- Dados Bancários da Conta Atualizados ----->");
			System.out.println(acc);
			
		}
		catch(DomainException error) {
			
			System.err.append(error.getMessage());
			
		}

		sc.close();

	}

}
