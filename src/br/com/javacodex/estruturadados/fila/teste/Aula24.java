package br.com.javacodex.estruturadados.fila.teste;

import br.com.javacodex.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
		
		fila.enfileira(1);
		
		fila.enfileira(3);
		
		fila.enfileira(2);
		
		System.out.println(fila);

	}

}
