package prova.a;

import java.util.Scanner;

public class Desafio1 {

	final static double pequeno = 13.50;
	final static double medio = 15.00;
	final static double grande = 17.50;

	public static void main(String[] args) {

		System.out.println("\nO VALOR TOTAL É: R$ " + calculaTotalDeVendas());

	}

	static double calculaTotalDeVendas() {

		Scanner scn = new Scanner(System.in);
		String tamanho = null;
		double valorTotalDaCompra = 0;
		double preco = 0;

		for (int i = 0; i < 3; ++i) {

			if (i == 0) {
				tamanho = "PEQUENO";
				preco = pequeno;
			} else if (i == 1) {
				tamanho = "MÉDIO";
				preco = medio;
			} else if (i == 2) {
				
				tamanho = "GRANDE";
				preco = grande;
			}

			System.out.print("INFORME QUANTOS AÇAÍ " + tamanho + " VOCÊ COMPROU: ");
			double quantidade = scn.nextDouble();

			valorTotalDaCompra = valorTotalDaCompra + (preco * quantidade);
		}

		return valorTotalDaCompra;
	}

}
