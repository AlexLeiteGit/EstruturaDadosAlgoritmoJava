package br.com.javacodex.estruturadados.base;

public class EstruturaEstatica<T> {
	
	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];// solu��o do livro effective java
		this.tamanho = 0;
	}

	public EstruturaEstatica() {
		this(10);
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	//equivalente ao m�todo ADD da Classe ArrayList. Adiciona ao final
		protected boolean adiciona(T elemento) {

			this.aumentaCapacidade();

			if (this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
				return true;
			}
			return false;
		}
		
		//equivalente ao m�todo ADD (posi��o, elemento) da classe ArrayList
		protected boolean adiciona(int posicao, T elemento) {

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
		
		private void aumentaCapacidade() {
			if (this.tamanho == this.elementos.length) {
				T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
				for (int i = 0; i < this.elementos.length; i++) {
					elementosNovos[i] = this.elementos[i];
				}
				this.elementos = elementosNovos;
			}
		}
		
		//equivalete ao m�todo SIZE da classe ArrayList.
		public int tamanho() {
			return this.tamanho;
		}
		
		public void remove(int posicao) {

			if (!(posicao >= 0 && posicao < tamanho)) {
				throw new IllegalArgumentException("Posi��o Inv�lida");
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
