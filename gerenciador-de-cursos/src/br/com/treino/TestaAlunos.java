package br.com.treino;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Set<String> alunos = new LinkedHashSet<>();

		alunos.add("José Victor");
		alunos.add("Rodrigo Pinheiro");
		alunos.add("Matheus Melo");
		alunos.add("Eduardo Melo");
		alunos.add("Luan Figueredo");
		alunos.add("Sthepanye");
		/**
		 * O método add devolve um booleano que indica o sucesson da inserção.
		 */
		System.out.println("Retorno da inserção: " + alunos.add("José Victor"));

		/**
		 * Um conjunto não define uma ordem, pois quando recebemos os elementos, eles
		 * estão diferente da ordem de inserção.
		 */
		System.out.println(alunos);
		System.out.println("Tamanho da coleção alunos: " + alunos.size());

//		for (String string : alunos) {		
//			System.out.println(string);	
//		}
		/**
		 * For presente na interface Iterable.
		 */

		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});

		String nomeDoAlunoAVerificar = "José Victor";
		boolean esseAlunoEstaMatriculado = alunos.contains(nomeDoAlunoAVerificar);

		System.out.println("O aluno " + nomeDoAlunoAVerificar + " está matriculado: " + esseAlunoEstaMatriculado);

	}

}
