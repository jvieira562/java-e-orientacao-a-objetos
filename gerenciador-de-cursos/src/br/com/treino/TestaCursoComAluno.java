package br.com.treino;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções", "Paulo Silvaira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 24));

		Aluno a1 = new Aluno("José Victor Santos", 34672);
		Aluno a2 = new Aluno("Rodrigo Pinheiro", 56017);
		Aluno a3 = new Aluno("Matheus Melo", 17045);

		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		/**
		 * Causandp uma java.lang.UnsupportedOperationException
		 *
		 * Set<Aluno> alunos = javaColecoes.getAlunos(); System.out.println(alunos);
		 * Aluno a4 = new Aluno("Teste", 2232); alunos.add(a4);
		 */

		System.out.println("Todos os alunos matriculados nesse curso: ");

		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});

		System.out.println("Esse aluno está matriculado: " + javaColecoes.estaMatriculado(a1));

		String nome = "José Victor Santos";

		Aluno jose = new Aluno(nome, 34672);

		System.out.print("\n1 - O aluno " + jose.getNome() + " está matriculado: ");
		System.out.println(javaColecoes.estaMatriculado(jose));

		System.out.println("\n2 - a1 equals " + jose.getNome() + ": " + (a1.equals(jose)));

		System.out.println("\n == Usando hashCode: " + (a1.hashCode() == jose.hashCode()));

		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {

			Aluno proximo = iterador.next();
			System.out.println("Iterator: " + proximo);
		}

	}

}
