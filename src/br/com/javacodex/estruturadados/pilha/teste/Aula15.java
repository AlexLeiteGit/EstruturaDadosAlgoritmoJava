package br.com.javacodex.estruturadados.pilha.teste;

import br.com.javacodex.estruturadados.pilha.Pilha;

public class Aula15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia());
		
		pilha.empilha(15);
		
		System.out.println(pilha.estaVazia());

	}

}
