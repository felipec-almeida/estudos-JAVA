package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o caminho da pasta: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		File[] pastas = path.listFiles(File::isDirectory);

		System.out.println("PASTAS:");
		for (File pasta : pastas) {

			System.out.println(pasta);

		}

		File[] arquivos = path.listFiles(File::isFile);

		System.out.println("ARQUIVOS:");
		for (File arquivo : arquivos) {

			System.out.println(arquivo);

		}

		boolean sucesso = new File(strPath + "\\subdiretorio").mkdir();

		strPath += "\\subdiretorio\\texto-1.txt";
		String[] linhas = { "Uma linha, Duas Linhas, Três Linhas, Quatro Linhas." };

		if (sucesso == true) {

			try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath))) {

				for (String linha : linhas) {

					bw.write(linha);
					bw.newLine();

				}

			} catch (IOException erro) {

				erro.getStackTrace();

			}

			try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {

				String linha = br.readLine();
				
				while(linha != null) {
					
					System.out.println(linha);
					linha = br.readLine();
					
				}

			} catch (IOException erro) {

				erro.getStackTrace();

			}

		}

		sc.close();

	}

}
