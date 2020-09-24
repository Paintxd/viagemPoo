package main;

public abstract class Animal {

	private String nome;
	private int comprimento;
	private String cor;
	private String ambiente;
	private double velocidade;
	private int patas;

	public Animal(String nome, int comprimento, String cor, String ambiente, double velocidade, int patas) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
		this.patas = patas;
	}

	public abstract void dados();

	public String getNome() {
		return nome;
	}

	public int getComprimento() {
		return comprimento;
	}

	public String getCor() {
		return cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public int getPatas() {
		return patas;
	}

}
