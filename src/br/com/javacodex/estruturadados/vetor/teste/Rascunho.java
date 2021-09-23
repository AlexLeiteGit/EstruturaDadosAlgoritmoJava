package br.com.javacodex.estruturadados.vetor.teste;

import java.security.SecureRandom;

public class Rascunho {

	public static void main(String[] args) {
		
		//declara array variável e o inicializa com um objeto array
		int[] elementos = new int[10];
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		//gera saída do valor de cada elemento do array
		for(int counter = 0; counter < elementos.length ; counter++) {
			System.out.printf("%5d%8d%n", counter, elementos[counter]);
		}
		
		System.out.println("===========================================================================");
		
		//A lista de inicialização especifica o valor inicial de cada elemento
		int[] array = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < array.length ; counter++) {
			System.out.printf("%5d%8d%n", counter, array[counter]);
		}
		
		System.out.println("===========================================================================");
		
		final int ARRAY_LENGTH = 10;// declara a constante que será o tamanho do array
		int[] lista = new int[ARRAY_LENGTH]; // cria o array
		
		//calcula o valor de cada array
		for(int i = 0; i < lista.length ; i++) {
			lista[i] = 2+2*i;
		}
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < lista.length ; counter++) {
			System.out.printf("%5d%8d%n", counter, lista[counter]);
		}
		
		System.out.println("===========================================================================");
		
		int[] array2 = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;
		
		//adiciona cada elemento a variável total
		for (int j = 0; j < array2.length; j++){
			total += array2[j];
		}
		
		System.out.printf("Total de elementos do Array2: %d%n", total);
		
		System.out.println("===========================================================================");
		
		int[] array3 = {0,0,0,0,0,0,1,2,4,2,1};
		
		System.out.println("Distribuição de Notas:");
		
		// cada elemento do array3 gera uma saída no gráfico
		for(int i=0; i<array3.length; i++) {
			
			//gera os rótulos da barra
			if(i==10) {
				System.out.printf("%n%5d: ", 100);
			} else {
				System.out.printf("%n%02d-%02d: ", i*10, i*10+9);
			}
		
			//imprime a barra de asterísticos
		for(int stars=0; stars<array3[i]; stars++) {
			System.out.print(" * ");
		}
		}
		
		System.out.println("===========================================================================");
		
		
		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency = new int[7];
		
		//lança o dado 6.000.000 vezes; usa o valor do dado como índice de frequência
		for(int roll =1; roll<=6000000; roll++) {
			++frequency[1 + randomNumbers.nextInt(6)];
			
			System.out.printf("%s%10s%n", "Face", "Frequency");
			
			//gera saída do valor de cada elemento
			for(int face = 1; face<frequency.length; face++) {
				System.out.printf("%4d%10d%n", face, frequency[face]);
			}
		}
		
		System.out.println("===========================================================================");
		
		int[] response = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,3,2,3,3,2,14};
		int[] frequency2 = new int[6];
		
		for(int answer = 0; answer < response.length; answer++) {
			try {
			++frequency2[response[answer]];
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println(e);
				System.out.printf("    response[%d] = %d%n%n", answer, response[answer]);
			}
		}
		
		System.out.printf("%s%10s%n", "Rating", "Frequency");
		
		for(int rating = 1; rating < frequency2.length ; rating++) {
			System.out.printf("%6d%10d%n", rating, frequency2[rating]);
		}
	}
}
