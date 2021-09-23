package br.com.javacodex.estruturadados.pilha.labs;

import java.util.Scanner;

import br.com.javacodex.estruturadados.pilha.Pilha;

public class Exerc03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		Pilha<Livros> pilha = new Pilha<Livros>(20);
		
		for(int i=1; i<=3; i++) {
			
				Livros livro = new Livros();
				
				System.out.println("Informe o nome do livro");
				livro.setNome(scan.nextLine());
				System.out.println("Informe o nome do isbn");
				livro.setIsbn(scan.nextLine());
				System.out.println("Informe o nome do ano");
				livro.setAno(scan.nextLine());
				System.out.println("Informe o nome do autor");
				livro.setAutor(scan.nextLine());
				
				pilha.empilha(livro);
		}
		
		System.out.println(pilha);

	}

}
