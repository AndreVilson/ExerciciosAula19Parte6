package exercicios.aula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Escreva um programa que
imprima cada elemento do vetor A e uma mensagem indicando se o
respectivo elemento é um número primo ou não.*/

public class Ex33 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			
			boolean primo = true;
			System.out.print(" " + vetorA[i]);
			for (int j = 2; j < vetorA[i]; j++) {

				if (vetorA[i] % j == 0) {
					primo = false;
					System.out.print(" Não é primo ");
					break;
				}
			}

			if (primo) {
				System.out.print(" é Primo");
			}
			System.out.println(" ");
		}

	}

}
