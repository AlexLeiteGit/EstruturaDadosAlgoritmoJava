package br.com.javacodex.estruturadados.fila.teste;

import br.com.javacodex.estruturadados.fila.Fila;

public class Aula20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fila<Integer> fila = new Fila<>();
		
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);

		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		System.out.println(fila.toString());

	}

}
