package main;

public class Caminhao extends Veiculo {

    private String tipoPneu;
    private int numeroEixos;

    public Caminhao(int potencia, String nome, String habilidade, String tipoPneu, int numeroEixos) {
        super(potencia, nome, habilidade);
        this.tipoPneu = tipoPneu;
        this.numeroEixos = numeroEixos;
    }

    @Override
    public void acelerar() {
        this.setPosicao(this.getPotencia());
    }

    @Override
    public void frear() {
        this.setPosicao(-(this.getPotencia() / 2));
    }
}
