package prova.a;

import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.err.println("\nINFORME APENAS NÚMEROS INTEIROS.\n");

		System.out.print("INFORME UM NÚMERO: ");
		int numero = scn.nextInt();

		System.out.println("\nAFATORIAL DO NÚMERO " + numero + " É " + calculaFatorial(numero) + ".");

	}

	static int calculaFatorial(int numero) {

		int fatorial = 1;

		for (int i = 1; i <= numero; i++) {

			fatorial = fatorial * i;

		}

		return fatorial;
	}

}
