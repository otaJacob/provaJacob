package avAVALIATIVA;

import java.util.Scanner;

public class atv4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[15];
		int soma = 0;

		System.out.println("Por favor, insira 15 números:");

		for (int i = 0; i < 15; i++) {
			System.out.print("Número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
			soma += numeros[i];
		}

		System.out.println("A soma dos números é: " + soma);

		scanner.close();
	}


}


