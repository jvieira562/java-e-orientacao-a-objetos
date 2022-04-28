package br.com.treino;

public class testaCurso {

	public static void main(String[] args) {

		
		Curso javaColecoes = new Curso("Dominando as coleções",
				"Paulo Silvaira");		
			
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 22));
		
		
		System.out.println(javaColecoes.getAulas());
	}

}
