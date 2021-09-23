package br.com.javacodex.estruturadados.vetor;

import br.com.javacodex.estruturadados.base.EstruturaEstatica;

public class Lista2<T> extends EstruturaEstatica<T>{

	public Lista2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lista2(int capacidade) {
		super(capacidade);
		// TODO Auto-generated constructor stub
	}

	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
	}
	
	public boolean adiciona(int posicao, T elemento) {
		return super.adiciona(posicao, elemento);
	}
	
}
