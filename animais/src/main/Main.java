package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            showMenu();
            int option = sc.nextInt();

            if (option < 4)
                optionMenu(option, sc, animais);
            else {
                System.out.println("Forte abraco!!");
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

    public static void optionMenu(int option, Scanner sc, List<Animal> animais) {
        switch (option) {
            case 1:
                System.out.println("Animal que deseja inserir (Mamifero - Peixe): ");
                sc.nextLine();
                String tipo = sc.nextLine();

                if (tipo.toLowerCase().equals("peixe") || tipo.toLowerCase().equals("mamifero")) {
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Comprimento: ");
                    int comprimento = sc.nextInt();
                    System.out.println("Cor: ");
                    sc.nextLine();
                    String cor = sc.nextLine();
                    System.out.println("Ambiente: ");
                    String ambiente = sc.nextLine();
                    System.out.println("Velocidade: ");
                    double velocidade = sc.nextDouble();

                    if (tipo.toLowerCase().equals("peixe")) {
                        System.out.println("Caracteristicas: ");
                        sc.nextLine();
                        String caracteristicas = sc.nextLine();
                        Peixe peixe = new Peixe(nome, comprimento, cor, ambiente, velocidade, 0, caracteristicas);
                        animais.add(peixe);
                    } else {
                        System.out.println("Patas: ");
                        int patas = sc.nextInt();
                        System.out.println("Alimento: ");
                        sc.nextLine();
                        String alimento = sc.nextLine();
                        Mamifero mamifero = new Mamifero(nome, comprimento, cor, ambiente, velocidade, patas, alimento);
                        animais.add(mamifero);
                    }
                    break;
                }
                System.out.println("------------------------");
                System.out.println("Tipo nao aceito");
                System.out.println("------------------------");
                break;
            case 2:
                if (animais.size() == 0) {
                    System.out.println("------------------------");
                    System.out.println("Sem animais na lista");
                    System.out.println("------------------------");
                    break;
                }
                System.out.println("Id do animal para retirar: ");
                int id = sc.nextInt();
                animais.remove(id);
                    break;
            case 3:
                System.out.println("Zoo:");
                System.out.println("------------------------");
                if(animais.size() == 0) {
                    System.out.println("Zoo sem animais");
                    break;
                }
                for (int i=0; i<animais.size(); i++) {
                    System.out.println("Id: " + i);
                    System.out.println("Tipo: " + animais.get(i).getClass().getSimpleName());
                    animais.get(i).dados();
                }
                break;
        }
    }
}
