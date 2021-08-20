package exercicios.aula19;

import java.util.Scanner;

/*Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que
cada elemento do vetor A é formado pela potência de base 2 elevado
ao expoente igual a posição do respectivo elemento, ou seja:
A[i] = 2 i . Sugestão int A[11];*/

public class Ex36 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			int base = 2;
			int resultado = 0;

			for (int j = 0; j < i; j++) {
				resultado = 2 * base;
				base = resultado;
			}
			vetorA[i] = resultado;
			System.out.println("posição " + i + " : " + vetorA[i]);

		}

	}

}
