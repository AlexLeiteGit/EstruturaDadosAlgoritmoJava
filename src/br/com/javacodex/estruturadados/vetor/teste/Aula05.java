package br.com.javacodex.estruturadados.vetor.teste;

import br.com.javacodex.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) throws Exception {

		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 01");
		vetor.adiciona("elemento 02");
		vetor.adiciona("elemento 03");
		
		System.out.println(vetor.busca(15));

	}

}
