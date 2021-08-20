package exercicios.aula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e a relação de todos os pares de 0
até o respectivo elemento.*/

public class Ex34 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int [] vetorA = new int [10];
		
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println("posição " + i + " : " + vetorA[i]);
			for (int j = 0; j <= vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j + " Par");
				}else {
					System.out.println(j + " Impar");
				}
			}
			
			
		}
		
		
	}

}
