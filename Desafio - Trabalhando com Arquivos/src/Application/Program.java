package Application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Caminho do Arquivo:");
		String strDiretorio = sc.nextLine();
		File diretorio = new File(strDiretorio);

		String strEntradaDir = diretorio.getParent();

		boolean sucesso = new File(strEntradaDir + "\\out").mkdir();

		String strFinalArq = strEntradaDir + "\\out\\out.txt";

		List<Produto> lista = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(strDiretorio))) {

			String itemTxt = br.readLine();
			while (itemTxt != null) {

				String[] campos = itemTxt.split(",");

				String nome = campos[0];
				Double preco = Double.parseDouble(campos[1]);
				Integer quantidade = Integer.parseInt(campos[2]);

				lista.add(new Produto(nome, preco, quantidade));

				itemTxt = br.readLine();

			}
			
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(strFinalArq))) {
				
				for(Produto item : lista) {
					
					bw.write(item.getNome() + ", " + String.format("%.2f", item.total()));
					bw.newLine();
					
				}
				
				System.out.println("Arquivo Criado!");
		
			} catch(IOException erro) {
				
				System.err.append("Erro ao Escrever no Arquivo: " + erro.getMessage());
				
			}

		} catch (IOException erro) {

			System.err.append("Erro ao Ler o Arquivo: " + erro.getMessage());

		}
		
		sc.close();

	}

}
