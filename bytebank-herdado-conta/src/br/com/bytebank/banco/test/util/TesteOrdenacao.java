package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Jos�");
		cc1.setTitular(clienteCC1); 
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Victor");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Santos");
		cc3.setTitular(clienteCC3);
		cc3.deposita(5111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Vieira");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		lista.sort(new NumeroDaContaCompatator());

		System.out.println("\n - Contas ordenadas em ordem crescente, de acordo com o numero da conta. \n");

		for (Conta conta : lista) {

			System.out.println(" - Nome do titular: " + conta.getTitular().getNome() + "\n - N�mero da conta: " + conta
					+ "\n ----------------------------------------------");
		}

		lista.sort(new TitularDaContaComparator());

		System.out.println("\n - Contas ordenadas por ordem alfabetica de acordo com nome do titular. \n");

		for (Conta conta : lista) {

			System.out.println(" - Nome do titular: " + conta.getTitular().getNome() + "\n - N�mero da conta: " + conta
					+ "\n ----------------------------------------------");
		}

		lista.sort(new SaldoDaContaComparator());

		System.out.println("\n - Contas ordenadas em ordem decrescente de acordo com o saldo do titular. \n");

		for (Conta conta : lista) {

			System.out.println(" - Nome do titular: " + conta.getTitular().getNome() + "\n - N�mero da conta: " + conta
					+ "\n - Saldo da conta: " + conta.getSaldo() + "\n ----------------------------------------------");
		}

	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();

		return nomeC1.compareTo(nomeC2);
	}

}

class NumeroDaContaCompatator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getNumero(), c2.getNumero());

	}

}

class SaldoDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		if (c1.getSaldo() < c2.getSaldo()) {

			return 1;
		}

		if (c1.getSaldo() > c2.getSaldo()) {

			return -1;
		}

		return 0;
	}

}