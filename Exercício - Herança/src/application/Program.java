package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Caminhao;
import model.entities.Onibus;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("<----- Informações do Veículo ----->");
			System.out.print("Tipo do Veículo (C - Caminhão / O - Ônibus): ");
			char tipo = sc.next().charAt(0);

			if (tipo == 'C' || tipo == 'c') {

				System.out.print("Placa (XXX-XXXX): ");
				String placa = sc.next();
				
				System.out.print("Ano: ");
				int ano = sc.nextInt();

				System.out.print("Capacidade de Carga (KG): ");
				double carga = sc.nextInt();

				System.out.print("Eixos: ");
				int eixos = sc.nextInt();

				System.out.print("Data da Última Revisão (dd/MM/yyyy): ");
				String revisao = sc.next();

				try {

					Caminhao caminhao = new Caminhao(placa, ano, carga, eixos, sdf.parse(revisao));
					System.out.println(caminhao.exibirDados());

				} catch (ParseException erro) {

					System.err.append("Erro ao converter a variável tipo String para tipo Date.");

				}

			} else if (tipo == 'O' || tipo == 'o') {

				System.out.print("Placa (XXX-XXXX): ");
				String placa = sc.next();
				
				System.out.print("Ano: ");
				int ano = sc.nextInt();

				System.out.print("Quantidade de Assentos: ");
				int assentos = sc.nextInt();

				System.out.print("Data da Última Revisão (dd/MM/yyyy): ");
				String revisao = sc.next();

				try {

					Onibus onibus = new Onibus(placa, ano, assentos, sdf.parse(revisao));
					System.out.println(onibus.exibirDados());

				} catch (ParseException erro) {

					System.err.append("Erro ao converter a variável tipo String para tipo Date.");

				}
			}

		} catch (InputMismatchException erro) {

			System.err.append("Erro: Algo deu errado, digite novamente.");

		}

		sc.close();

	}

}
