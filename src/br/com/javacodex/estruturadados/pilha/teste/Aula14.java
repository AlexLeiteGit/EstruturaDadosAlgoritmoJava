package br.com.javacodex.estruturadados.pilha.teste;

import br.com.javacodex.estruturadados.pilha.Pilha;

public class Aula14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for(int i=1; i<=10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());

	}

}
