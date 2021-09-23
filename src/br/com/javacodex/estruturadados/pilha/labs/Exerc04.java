package br.com.javacodex.estruturadados.pilha.labs;

import java.util.Scanner;
import java.util.Stack;

public class Exerc04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		Stack<Livros> pilha = new Stack<Livros>();

		System.out.println("Pilha de livros criada, pilha está vazia? " + pilha.isEmpty());

		for (int i = 0; i < 3; i++) {

			Livros livro = new Livros();

			System.out.println("Informe o nome do livro");
			livro.setNome(scan.nextLine());
			System.out.println("Informe o nome do isbn");
			livro.setIsbn(scan.nextLine());
			System.out.println("Informe o nome do ano");
			livro.setAno(scan.nextLine());
			System.out.println("Informe o nome do autor");
			livro.setAutor(scan.nextLine());

			System.out.println("Empilhando livro na prateleira " + (i + 1));

			pilha.push(livro);
		}

		System.out.println(pilha.size() + " livros empilhados!");

		System.out.println(pilha);

		System.out.println("Espiando o topo da pilha: " + pilha.peek());

		System.out.println("Desempilhando Livros: ");

		while (!pilha.isEmpty()) {
			System.out.println("Desempilhando livro: " + pilha.pop());
		}

		System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());

	}

}
