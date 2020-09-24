package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<Forma>();
        formas.add(new Circulo(15.3f));
        formas.add(new Quadrado(44));
        formas.add(new Rectangulo(3.4f, 18.5f));
        formas.add(new Circulo(9.1f));
        formas.add(new Rectangulo(93.02f, 1.5f));

        for (Forma forma : formas) {
            System.out.println("Forma: " + forma.getClass().getSimpleName());
            System.out.println("Area: " + forma.calcularArea());
            System.out.println("Perimetro: " + forma.calcularPerimetro());
            System.out.println("========================");
        }

    }

    public static int randGen() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
