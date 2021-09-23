package br.com.javacodex.estruturadados.pilha.teste;

import br.com.javacodex.estruturadados.pilha.Pilha;

public class Aula16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pilha<Integer> pilha = new Pilha<Integer>();

		System.out.println(pilha.topo());

		System.out.println(pilha);

		pilha.empilha(12);
		pilha.empilha(2);
		pilha.empilha(1);

		System.out.println(pilha.topo());

		System.out.println(pilha);

	}

}
