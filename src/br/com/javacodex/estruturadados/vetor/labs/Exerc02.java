package br.com.javacodex.estruturadados.vetor.labs;

import java.util.ArrayList;

import br.com.javacodex.estruturadados.vetor.Lista;

public class Exerc02 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<String>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.lastIndexOf("B"));
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println(lista);
		
		System.out.println(lista.ultimoIndice("F"));
		

	}

}
