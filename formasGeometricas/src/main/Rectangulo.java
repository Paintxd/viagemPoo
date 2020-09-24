package main;

public class Rectangulo extends Forma {

    private float lado;
    private float altura;

    public Rectangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public float calcularArea() {
        return lado * altura;
    }

    @Override
    public float calcularPerimetro() {
        return (2 * lado) + (2 * altura);
    }

}
