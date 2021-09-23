package br.com.javacodex.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> fila = new LinkedList<>();
		
		fila.add(1);//enfileirar
		fila.add(2);
		
		System.out.println(fila);
		System.out.println(fila.peek());//espiar
		System.out.println(fila.remove());//desenfileirar
		System.out.println(fila);

	}

}
