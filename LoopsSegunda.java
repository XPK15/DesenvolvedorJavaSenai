package aulas;

import java.util.Scanner;

public class LoopsSegunda {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String username = null;
		String password = null;

		System.out.print("Crie um nome de usuário para si: ");
		username = scan.next();
		System.out.print("Agora, crie sua senha: ");
		password = scan.next();

		while (username.equals(password)) {
			System.out.println("\nO nome de usuário e a senha devem ser diferentes. Tente novamente.");
			System.out.print("\nNome de Usuário: ");
			username = scan.next();
			System.out.print("Senha: ");
			password = scan.next();
		}

		System.out.println("\nO nome de usuário e a senha inseridos foram cadastrados com sucesso.");

		scan.close();
	}

}
