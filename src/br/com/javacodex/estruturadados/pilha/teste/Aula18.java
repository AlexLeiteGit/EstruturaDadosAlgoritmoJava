package br.com.javacodex.estruturadados.pilha.teste;

import java.util.Stack;

public class Aula18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1);//método empilha
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.isEmpty());//método estaVazio
		
		System.out.println(stack.size());//método tamanho
		
		System.out.println(stack);
		
		System.out.println(stack.peek());//método topo
		
		System.out.println(stack.pop());//método desempilha
		
		System.out.println(stack);
		

	}

}
