package br.com.javacodex.estruturadados.vetor.labs;

import br.com.javacodex.estruturadados.vetor.Lista;

public class Exerc04 {

	public static void main(String[] args) throws Exception {

		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");

		System.out.println(lista);
		
		System.out.println(lista.obtem(1));

	}

}
