package br.com.javacodex.estruturadados.base;

public class EstruturaEstatica<T> {
	
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];// solução do livro effective java
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	//equivalente ao método ADD da Classe ArrayList. Adiciona ao final
		protected boolean adiciona(T elemento) {

			this.aumentaCapacidade();

			if (this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
				return true;
			}
			return false;
		}
		
		//equivalente ao método ADD (posição, elemento) da classe ArrayList
		protected boolean adiciona(int posicao, T elemento) {

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
		
		private void aumentaCapacidade() {
			if (this.tamanho == this.elementos.length) {
				T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
				for (int i = 0; i < this.elementos.length; i++) {
					elementosNovos[i] = this.elementos[i];
				}
				this.elementos = elementosNovos;
			}
		}
		
		//equivalete ao método SIZE da classe ArrayList.
		public int tamanho() {
			return this.tamanho;
		}
		
		public void remove(int posicao) {

			if (!(posicao >= 0 && posicao < tamanho)) {
				throw new IllegalArgumentException("Posição Inválida");
			}

			for (int i = posicao; i <= this.tamanho; i++) {
				this.elementos[i] = this.elementos[i + 1];
			}

			this.tamanho--;
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
