package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		String path = "C:\\Users\\felip\\OneDrive\\Área de Trabalho\\Curso - JAVA\\Trabalhando com Arquivos - BufferedReader e FileReader\\Arquivos  -Texto\\arquivo.txt";

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			String linhas[] = { "Oi, hoje é dia: " };
			
			for(String linha : linhas) {
				
				bw.write(linha);
				bw.write(sdf.format(data));
				bw.newLine();
				
			}
			
		} catch(IOException erro) {
			
			System.err.append("Erro: " + erro.getMessage());
			
		}
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String linha = br.readLine();
			
			while(linha != null) {
				
				System.out.println(linha);
				linha = br.readLine();
				
			}
			
		} catch(IOException erro) {
			
			System.err.append("Erro: " + erro.getMessage());
			
		}
		
	}

}
