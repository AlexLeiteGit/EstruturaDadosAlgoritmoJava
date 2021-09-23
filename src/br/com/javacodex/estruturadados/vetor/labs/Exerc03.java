package br.com.javacodex.estruturadados.vetor.labs;

import br.com.javacodex.estruturadados.vetor.Lista;

public class Exerc03 {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>(5);

		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");

		System.out.println(lista);
		
		lista.remove("E");
		
		System.out.println(lista);

	}

}
