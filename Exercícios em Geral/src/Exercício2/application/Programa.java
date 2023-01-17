package Exercício2.application;

import java.util.Locale;
import java.util.Scanner;

import Exercício2.model.entities.Televisão;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

			System.out.println("<----- TELEVISÃO LIGADA ----->");
			
			Televisão tv = new Televisão();
			Integer numero = 1;
			
			while(numero != null) {
				
				System.out.print("Quer mudar de canal (Sim / Não)? ");
				String resposta_canal = sc.next();
				
				if(resposta_canal.charAt(0) == 'S' || resposta_canal.charAt(0) == 's') {
					
					System.out.print("Digite o Número do Canal (De 1 a 8): ");
					int numero_canal = sc.nextInt();
					tv.mudaCanal(numero_canal);
					System.out.println("<----- Canal Mudado ----->");
					
				} else {
					
					numero = null;
					
				}
				
			}

			numero = 1;
			while(numero != null) {
			
				System.out.print("Quer mudar o Volume? (Sim / Não): ");
				String resposta_volume = sc.next();
				
				if(resposta_volume.charAt(0) == 'S' || resposta_volume.charAt(0) == 's') {
					
					System.out.println("Quer Aumentar ou Abaixar o Volume? ");
					String resposta_volume2 = sc.next();
					if(resposta_volume2.charAt(0) == 'A' || resposta_volume2.charAt(0) == 'a' && resposta_volume2.charAt(1) == 'u') {
						
						tv.aumentaVolume();
						
					} else {
						
						tv.abaixaVolume();
						
					}
					
				} else {
					
					numero = null;
					
				}
			}
			
			System.out.println(tv);
			
		sc.close();
		
	}

}
