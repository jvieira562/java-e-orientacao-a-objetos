package br.com.treino;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteEmptySet {
	public static void main(String[] args) {

//		Set<String> nomes = Collections.emptySet();
//		nomes.add("Paulo"); // o que acontece aqui?
		
		Set<Aluno> alunos = new HashSet<>();
		
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		
		System.out.println(alunosSincronizados);
	}

}
