package main;

public class Mamifero extends Animal {

	private String alimento;

	public Mamifero(String nome, int comprimento, String cor, String ambiente, double velocidade, int patas,
			String alimento) {
		super(nome, comprimento, cor, ambiente, velocidade, patas);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void dados() {
		System.out.println("Nome: " + this.getNome() + "\nComprimento: " + this.getComprimento() + " cm" + "\nCor: "
				+ this.getCor() + "\nAmbiente: " + this.getAmbiente() + "\nVelocidade: " + this.getVelocidade() + " m/s"
				+ "\nPatas: " + this.getPatas() + "\nAlimento: " + this.getAlimento());
		System.out.println("------------------------");
	}

}
