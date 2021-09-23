package br.com.javacodex.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];// solução do livro effective java
		this.tamanho = 0;
	}

	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade); // utilizando a classe reflection
		this.tamanho = 0;
	}
	
	//equivalente ao método ADD (posição, elemento) da classe ArrayList
	public boolean adiciona(int posicao, T elemento) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}

		this.aumentaCapacidade();

		for (int i = tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}
	
	//equivalente ao método ADD da Classe ArrayList
	public boolean adiciona(T elemento) {

		this.aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	//Exercício 04
	public T obtem(int posicao) throws Exception {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}

		return this.elementos[posicao];
	}

	//equivalente ao método CONTAINS da classe ArrayList, basta alterar o tipo para boolean
	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	//equivalente ao método REMOVE da classe ArrayList. Pode passar como parâmetro um indice ou o próprio objeto.
	public void remove(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida");
		}

		for (int i = posicao; i <= this.tamanho; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}

		this.tamanho--;
	}
	
	//Exercício 03
	public void remove(T elemento) {	
		for(int i = 0; i < this.tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				this.elementos[i] = this.elementos[i + 1];
			}
		}
		this.tamanho--;
	}

	private void aumentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//Exercício 05
	public void limpar() {
		
		//opção 01
//		this.elementos = (T[]) new Object[this.elementos.length];
		
		//opção 02
//		this.tamanho = 0;
		
		//opção 03
		for(int i = this.tamanho; i<=0; i--) {
			this.elementos[i] = null;
			}
		this.tamanho = 0;
		}

	//equivalete ao método SIZE da classe ArrayList.
	public int tamanho() {
		return this.tamanho;
	}
	
	//Exercício 01 - Implementação de método contém equivalente ao CONTAINS da classe arrayList	
//	public boolean contem(T elemento) {
//		for (int i = 0; i < this.tamanho; i++) {
//			if (elementos[i].equals(elemento)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	//Exercício 01 - Solução que melhora a manutenção do código pois só precisaríamos alterar o método busca.
	public boolean contem(T elemento) {
		int pos = busca(elemento);
		if(pos > -1) {
			return true;
		}
		
		return false;
	}
	
	//Exercício 02
	public int ultimoIndice(T elemento) {
		for(int i = this.tamanho-1; i >=0; i--) {
			if(elementos[i].equals(elemento)){
				return i;
			}
		}
		return -1;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();

		s.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}

}
