package main;

public class Peixe extends Animal {

	private String caracteristica;

	public Peixe(String nome, int comprimento, String cor, String ambiente, double velocidade, int patas,
			String caracteristica) {
		super(nome, comprimento, cor, ambiente, velocidade, patas);
		this.caracteristica = caracteristica;
	}

	public void dados() {
		System.out.println("\nNome: " + this.getNome() + "\nComprimento: " + this.getComprimento() + " cm" + "\nCor: "
				+ this.getCor() + "\nAmbiente: " + this.getAmbiente() + "\nVelocidade: " + this.getVelocidade() + " m/s"
				+ "\nPatas: " + this.getPatas() + "\nCaracteristica: " + this.getCaracteristica());
		System.out.println("-------------------");
	}

	public String getCaracteristica() {
		return caracteristica;
	}

}
