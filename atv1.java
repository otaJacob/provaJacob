package avAVALIATIVA;

import java.util.Scanner;

public class atv1 {

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);

		 
		System.out.print("Digite o primeiro número: ");
		double numero1 = scanner1.nextDouble();

		 
		System.out.print("Digite o segundo número: ");
		double numero2 = scanner1.nextDouble();

	 
		System.out.print("Digite o operador (+, -, *, /): ");
		char operador = scanner1.next().charAt(0);

		double resultado = 0;

		 
		switch (operador) {
		case '+':
			resultado = numero1 + numero2;
			break;
		case '-':
			resultado = numero1 - numero2;
			break;
		case '*':
			resultado = numero1 * numero2;
			break;
		case '/':
			resultado = numero1 / numero2;
			break;
			 
		default:
			System.out.println("Erro: Operador inválido.");
			scanner1.close();
		}
	 
		System.out.println("O resultado da operação é: " + resultado);

	 
		scanner1.close();
	}
}