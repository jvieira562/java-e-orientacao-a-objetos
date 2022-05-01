package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OdernaString {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();

		palavras.add("Rodrigo");
		palavras.add("Luan Figueredo");
		palavras.add("José Victor");

		/**
		 * Listas antes do Java 8
		 */
		System.out.println("ANTES DO USO DA COLLECTIONS.\n\n" + palavras + "\n");
		Collections.sort(palavras);
		System.out.println("DEPOIS DO USO DA COLLECTIONS.\n\n" + palavras + "\n");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		Collections.sort(palavras, comparador);
		/**
		 * Fazendo uso da Interface Comparator e sobreescrevendo metodo compare.
		 * Logo após passando implementação para o metodo osrt da classe utiliaria Collections.
		 */
		
		System.out.println("APÓS SOBREESCREVER METODO COMPARE DA INTERFACE COMPARATOR.\n\n" + palavras + "\n");
		
		/**
		 * Após o Java 8, a Interface List ganhou um metodo Sort.
		 * Onde podemos passar o nosso comparator.
		 */
		// List<String> palavras = new ArrayList<String>();
		palavras.sort(comparador); 
		/**
		 * Mostra o mesmo resultado 
		 */
		System.out.println("USANDO O METODO SORT DA INTERFACE LIST.\n\n" + palavras + "\n");

	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() < o2.length()) {
			return -1;
		}
		if (o1.length() > o2.length()) {
			return 1;
		}
		return 0;
	}

}
