package br.com.javacodex.estruturadados.fila;

import java.util.Arrays;

import br.com.javacodex.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{

	public Fila() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fila(int capacidade) {
		super(capacidade);
		// TODO Auto-generated constructor stub
	}
	
	public void enfileira(T elemento) {
		this.adiciona(elemento);
	}
	
	public T espiar() {
		
		if(this.estaVazia()) {
			return null;
		}
		
		return this.elementos[0];
	}
	
	public T desenfileira() {
		
		final int POS = 0;
		
		if(this.estaVazia()) {
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POS];
		
		this.remove(POS);
		
		return elementoASerRemovido;
	}

	@Override
	public String toString() {
		return "Fila [elementos=" + Arrays.toString(elementos) + "]";
	}
	
	

}
