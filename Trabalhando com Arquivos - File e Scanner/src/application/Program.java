package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\felip\\OneDrive\\Área de Trabalho\\Curso - JAVA\\Trabalhando com Arquivos - File e Scanner\\Arquivos - Textos\\teste-1.txt");
		Scanner sc = null;
		
		try {
			
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				
				System.out.println(sc.nextLine());
				
			}
			
		} catch(IOException error) {
			
			System.err.append("Erro: " + error.getMessage());
			
		} finally {
			
			if(sc != null) {
				
				sc.close();
				
			}
			
		}
		
	}

}
