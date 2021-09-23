package br.com.javacodex.estruturadados.fila.teste;

import br.com.javacodex.estruturadados.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fila<Integer> fila = new Fila<>();

		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		fila.enfileira(4);
		fila.enfileira(5);
		fila.enfileira(6);
		fila.enfileira(7);

		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		System.out.println(fila.espiar());

		System.out.println(fila.toString());

	}

}
