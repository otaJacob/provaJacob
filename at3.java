package avAVALIATIVA;

import java.util.Scanner;

public class at3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número de 1 a 7 referente ao dia da semana: ");
		int dia = scanner.nextInt();

		String nomeDoDia = null;

		switch (dia) {
		case 1:
			nomeDoDia = "Domingo";
			break;
		case 2:
			nomeDoDia = "Segunda-feira";
			break;
		case 3:
			nomeDoDia = "Terça-feira";
			break;
		case 4:
			nomeDoDia = "Quarta-feira";
			break;
		case 5:
			nomeDoDia = "Quinta-feira";
			break;
		case 6:
			nomeDoDia = "Sexta-feira";
			break;
		case 7:
			nomeDoDia = "Sábado";
			break;

		}

		System.out.println(nomeDoDia);

		scanner.close();
	}


}


