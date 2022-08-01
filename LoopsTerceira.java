package aulas;

import java.util.Scanner;

public class LoopsTerceira {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// variáveis
		String nome = null;
		int idade = 0;
		int salario = 0;
		char sexo = '0';
		char estadoCivil = '0';

		// solicitação do nome
		System.out.print("Por favor, digite um nome: ");
		nome = sc.next();

		while (nome.length() <= 3) {
			System.out.print("Um nome válido deve conter mais de 3 caracteres. Tente novamente: ");
			nome = sc.next();
		}
		// solicitação da idade
		System.out.print("\nAgora, digite sua idade: ");
		idade = sc.nextInt();

		while (idade < 0 || idade > 150) {
			System.out.print("A idade informada é inválida. Tente novamente: ");
			idade = sc.nextInt();
		}
		// solicitação do salário
		System.out.print("\nDigite o valor de seu salário: R$");
		salario = sc.nextInt();

		while (salario <= 0) {
			System.out.print("O valor do salário deve ser maior que 0. Tente novamente: R$");
			salario = sc.nextInt();
		}
		// solicitação do sexo
		System.out.print(
				"\nPor favor, digite o caractere correspondente a seu sexo (‹m› para masculino e ‹f› para feminino): ");
		sexo = sc.next().charAt(0);

		while (sexo != ('m') && sexo != 'f') {
			System.out.print("O caractere correspondente ao sexo deve ser ‹m› ou ‹f›. Tente novamente: ");
			sexo = sc.next().charAt(0);
		}
		// solicitação do estado civil
		System.out.print(
				"\nDigite o caractere correspondente a seu estado civil atual:\n\ts = solteiro\n\tc = casado\n\tv = viúvo\n\td = divorciado\nopção: ");
		estadoCivil = sc.next().charAt(0);

		while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
			System.out.print("O caractere informado não corresponde às opções válidas. Tente novamente: ");
			estadoCivil = sc.next().charAt(0);
		}

		sc.close();
	}

}
