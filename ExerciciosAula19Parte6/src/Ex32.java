package exercicios.aula19;

import java.util.Scanner;

/*Criar um vetor A com 5 elementos inteiros. Escreva um programa que
imprima a tabuada de cada um dos elementos do vetor A.*/

public class Ex32 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int tabuada = 10;
		int resultado = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			
			System.out.println(" ");
			System.out.println("Tabuada " + vetorA[i]);
			for (int j = 0; j <= tabuada; j++) {
				resultado = vetorA[i] * j;
				System.out.println(vetorA[i] + " x " + j + " = " + resultado);
			}
			

		}

	}

}
