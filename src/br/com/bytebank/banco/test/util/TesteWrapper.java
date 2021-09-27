package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {
	
	public static void main(String[] args) {
		
		int[]	idade = new int[5];
		
		Integer idadeRef = Integer.valueOf(30);
		
		System.out.println(" - Valor Maximo: " + idadeRef.MAX_VALUE);
		System.out.println(" - Valor minimo: " + idadeRef.MIN_VALUE);
		System.out.println(" - Bytes: " + idadeRef.BYTES);
		System.out.println(" - Size: " + idadeRef.SIZE);
		
		System.out.println(idadeRef);

		List numeros = new ArrayList();
	}

}
