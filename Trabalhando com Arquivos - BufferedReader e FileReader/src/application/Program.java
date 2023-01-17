package application;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "C:\\Users\\felip\\OneDrive\\Área de Trabalho\\Curso - JAVA\\Trabalhando com Arquivos - File e Scanner\\Arquivos - Textos\\teste-1.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				System.out.println(line);
				line = br.readLine();

			}

		} catch (IOException erro) {

			System.err.append("Erro - " + erro.getMessage());

		}

	}

}
