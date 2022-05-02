package prova.a;

import java.util.Scanner;

public class Desafio2 {

	static double valorACadaCemGramas = 0;

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		double totalDeGramas;

		do {
			System.out.print("INFORME QUANTAS GRAMAS VOCÊ COMPROU: ");
			totalDeGramas = scn.nextDouble();
			
			if (totalDeGramas <= 0)	{
				
				System.err.println("\nINFORME UM VALOR MAIOR QUE ZERO.\n");
			}
			
		} while (totalDeGramas <= 0);

		System.out.println("\nTOTAL A PAGAR: R$ " + totalAPagar(totalDeGramas));

	}

	static double totalAPagar(double totalDeGramas) {

		if (totalDeGramas <= 1000) {

			valorACadaCemGramas = 3.50;
		}
		if (totalDeGramas > 1000) {

			valorACadaCemGramas = 3;
		}
		
		return valorACadaCemGramas * (totalDeGramas / 100);
	}

}
