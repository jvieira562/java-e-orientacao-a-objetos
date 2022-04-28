package br.com.treino;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(aula1);

		System.out.println(aulas);

		for (String aula : aulas) {
			System.out.println("AULA: " + aula);
		}

		String primeiraAula = aulas.get(0);

		System.out.println("PRIMEIRA AULA: " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("AULA: " + aulas.get(i));
		}

		System.out.println(aulas.size());

		aulas.forEach(aula -> {
			System.out.println("PERCORRENDO: " + aula);
		});
		
		aulas.add("Aumentando nosso conchecimento");
		Collections.sort(aulas);
		System.out.println("DEPOIS DE ORDENADO: " + aulas);
		

	}
}
