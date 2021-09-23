package br.com.javacodex.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> {

	private T[] elementos;
	private int tamanho;

	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];// solu��o do livro effective java
		this.tamanho = 0;
	}

	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade); // utilizando a classe reflection
		this.tamanho = 0;
	}
	
	//equivalente ao m�todo ADD (posi��o, elemento) da classe ArrayList
	public boolean adiciona(int posicao, T elemento) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}

		this.aumentaCapacidade();

		for (int i = tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}

		this.elementos[posicao] = elemento;
		this.tamanho++;

		return true;
	}
	
	//equivalente ao m�todo ADD da Classe ArrayList
	public boolean adiciona(T elemento) {

		this.aumentaCapacidade();

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	//Exerc�cio 04
	public T obtem(int posicao) throws Exception {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}

		return this.elementos[posicao];
	}

	//equivalente ao m�todo CONTAINS da classe ArrayList, basta alterar o tipo para boolean
	public int busca(T elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	//equivalente ao m�todo REMOVE da classe ArrayList. Pode passar como par�metro um indice ou o pr�prio objeto.
	public void remove(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}

		for (int i = posicao; i <= this.tamanho; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}

		this.tamanho--;
	}
	
	//Exerc�cio 03
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
	
	//Exerc�cio 05
	public void limpar() {
		
		//op��o 01
//		this.elementos = (T[]) new Object[this.elementos.length];
		
		//op��o 02
//		this.tamanho = 0;
		
		//op��o 03
		for(int i = this.tamanho; i<=0; i--) {
			this.elementos[i] = null;
			}
		this.tamanho = 0;
		}

	//equivalete ao m�todo SIZE da classe ArrayList.
	public int tamanho() {
		return this.tamanho;
	}
	
	//Exerc�cio 01 - Implementa��o de m�todo cont�m equivalente ao CONTAINS da classe arrayList	
//	public boolean contem(T elemento) {
//		for (int i = 0; i < this.tamanho; i++) {
//			if (elementos[i].equals(elemento)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
	//Exerc�cio 01 - Solu��o que melhora a manuten��o do c�digo pois s� precisar�amos alterar o m�todo busca.
	public boolean contem(T elemento) {
		int pos = busca(elemento);
		if(pos > -1) {
			return true;
		}
		
		return false;
	}
	
	//Exerc�cio 02
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
