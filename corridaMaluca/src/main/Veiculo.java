package main;

public abstract class Veiculo {

    private int potencia;
    private String nome;
    private int posicao;
    private String habilidade;

    public Veiculo(int potencia, String nome, String habilidade) {
        this.potencia = potencia;
        this.nome = nome;
        this.posicao = 0;
        this.habilidade = habilidade;
    }

    protected Veiculo() {
    }

    public abstract void acelerar();

    public abstract void frear();


    public int getPotencia() {
        return potencia;
    }

    public String getNome() {
        return nome;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = Math.max(this.posicao + posicao, 0);
    }
}
