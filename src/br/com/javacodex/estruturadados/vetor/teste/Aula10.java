package br.com.javacodex.estruturadados.vetor.teste;

import br.com.javacodex.estruturadados.vetor.VetorObjeto;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjeto vetor = new VetorObjeto(3);
		
		Contato c1 = new Contato("Contato 1", "1234-5678", "contato1@gmail.com");
		Contato c2 = new Contato("Contato 2", "9876-5432", "contato2@gmail.com");
		Contato c3 = new Contato("Contato 3", "1234-6789", "contato3@gmail.com");
		
		Contato c4 = new Contato("Contato 4", "7654-6789", "contato4@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		int pos = vetor.busca(c4);
		
		if(pos > -1) {
			System.out.println("Elemento existe no vetor");
		} else {
			System.out.println("Elemento não existe no vetor");
		}
				
		System.out.println(vetor);

	}

}
