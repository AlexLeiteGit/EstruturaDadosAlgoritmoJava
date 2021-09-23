package br.com.javacodex.estruturadados.vetor.labs;

import java.util.ArrayList;

import br.com.javacodex.estruturadados.vetor.Lista;

public class Exerc05 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>(6);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");

		System.out.println(arrayList);
		
		arrayList.clear();
		
		System.out.println(arrayList);

		Lista<String> lista = new Lista<String>(6);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);
		
		
		
	}

}
