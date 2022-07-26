package aulas;

import java.util.Scanner;

public class LoopsPrimeira {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int nota = 0;

		System.out.print("Por favor, digite uma nota de 0 a 10: ");
		nota = scan.nextInt();

		while(nota < 0 || nota > 10) {
				System.out.print("\nO número inserido é inválido. Tente novamente: ");
				nota = scan.nextInt();
			}
		System.out.println("\nO número inserido é válido.");
	}
}
