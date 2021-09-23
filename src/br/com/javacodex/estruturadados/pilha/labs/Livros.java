package br.com.javacodex.estruturadados.pilha.labs;

public class Livros {
	
	private String nome;
	private String isbn;
	private String ano;
	private String autor;
	
	public Livros() {}
	
	public Livros(String nome, String isbn, String ano, String autor) {
		this.nome = nome;
		this.isbn = isbn;
		this.ano = ano;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Livros [nome=" + nome + ", isbn=" + isbn + ", ano=" + ano + ", autor=" + autor + "]";
	}
	
	
	
	

}
