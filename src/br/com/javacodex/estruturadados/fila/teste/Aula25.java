package br.com.javacodex.estruturadados.fila.teste;

import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> filaComPrioridade = new PriorityQueue<Integer>();
		
		filaComPrioridade.add(2);
		filaComPrioridade.add(1);
		filaComPrioridade.add(3);
		filaComPrioridade.add(5);
		filaComPrioridade.add(4);
		
		System.out.println(filaComPrioridade);
		

	}

}
