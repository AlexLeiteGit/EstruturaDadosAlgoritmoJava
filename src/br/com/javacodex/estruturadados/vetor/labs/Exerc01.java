package br.com.javacodex.estruturadados.vetor.labs;

import br.com.javacodex.estruturadados.vetor.Lista;

public class Exerc01 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("E"));

	}

}
