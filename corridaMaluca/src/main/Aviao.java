package main;

public class Aviao extends Veiculo {

    private int altitude;

    public Aviao(int potencia, String nome, String habilidade, int altitude) {
        super(potencia, nome, habilidade);
        this.altitude = altitude;
    }

    public void mudarAltitude(int altitude) {
        this.altitude += altitude;
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
