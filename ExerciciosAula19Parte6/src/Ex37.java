package exercicios.aula19;

import java.util.Scanner;

/*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
do elemento correspondente em A.*/

public class Ex37 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}
		int i = 0;

		for (i = 0; i < vetorA.length; i++) {

			int fatorial = 1;

			for (int j = vetorA[i]; j > 0; j--) {
				fatorial = fatorial * j;

			}
			vetorB[i] = fatorial;
			
		}
		System.out.println("vetorA");
		for ( i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
			
		}
		System.out.println(" ");
		System.out.println("vetorB");
		for (i = 0; i < vetorB.length; i++) {
			System.out.print(" " + vetorB[i]);
		}

	}

}
