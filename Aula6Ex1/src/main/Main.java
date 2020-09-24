package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			showMenu();
			int option = sc.nextInt();

			if (option < 4)
				optionMenu(option, sc);
			else {
				System.out.println("Forte abraço!!");
				break;
			}
		}

		sc.close();
	}

	public static void showMenu() {
		System.out.println("Menu: ");
		System.out.println("1. Adicionar animal");
		System.out.println("2. Remover animal");
		System.out.println("3. Imprimir animais");
		System.out.println("4. Quit");
		System.out.println("Opcao: ");
	}

	public static void optionMenu(int option, Agenda agenda, Scanner sc) {
		switch (option) {
		case 1:
			if (agenda.getPessoasCounter() < 10) {
				System.out.println("Idade: ");
				Integer idade = sc.nextInt();
				sc.nextLine();
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Altura: ");
				Double altura = sc.nextDouble();
				agenda.armazenarPessoa(nome, idade, altura);
			} else
				System.out.println("Você ja possui 10 pessoas na sua agenda");
			break;
		case 2:
			if (agenda.getPessoasCounter() > 0)
				agenda.imprimirAgenda();
			else
				System.out.println("Agenda vazia");
			break;
		case 3:
			System.out.println("Zoo:");
			System.out.println("-------------------");
			break;
		}
	}
}
