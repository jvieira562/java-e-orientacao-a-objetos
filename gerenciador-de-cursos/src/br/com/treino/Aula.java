package br.com.treino;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "[AULA: " + this.titulo + ", " + this.tempo + " MINUTOS]";
	}

	@Override
	public int compareTo(Aula outraAula) {

		return this.titulo.compareToIgnoreCase(outraAula.titulo);
	}

}
