package main;

public class Circulo extends Forma {

    private float raio;
    private double pi;

    public Circulo(float raio) {
        this.raio = raio;
        this.pi = Math.PI;
    }

    @Override
    public float calcularArea() {
        return (float) (pi * (raio * raio));
    }

    @Override
    public float calcularPerimetro() {
        return (float) ((2 * pi) * raio);
    }
}
