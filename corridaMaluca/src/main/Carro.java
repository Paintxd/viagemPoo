package main;

public class Carro extends Veiculo {

    private String tipoPneu;

    public Carro(int potencia, String nome, String habilidade, String tipoPneu) {
        super(potencia, nome, habilidade);
        this.tipoPneu = tipoPneu;
    }

    @Override
    public void acelerar() {
        this.setPosicao(this.getPotencia());
    }

    @Override
    public void frear() {
        this.setPosicao(-(this.getPotencia() / 3));
    }
}
