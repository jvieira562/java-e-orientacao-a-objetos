package br.com.treino;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
	
	public static void main(String[] args) {
		
		Aula a1 = new Aula("Revisitando as ArrayLists", 21);;
		Aula a2 = new Aula("Lista de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
//		
//		Metodo forEach da classe Collections iterando sobre aulas
//		+ expressão lambda.
//		aulas.forEach(aula -> {System.out.println(aula);});
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		//Ordenando aulas comparando o tempo das aulas.
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		
		System.out.println("MUDANÇA DE TEMPO: " + aulas);
		
		aulas.sort(Comparator.comparing(Aula::getTempo));
		
		}

}
