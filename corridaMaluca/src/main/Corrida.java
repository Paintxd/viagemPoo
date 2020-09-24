package main;

import java.util.List;

public class Corrida {

    private int tamanho;
    private List<Veiculo> competidores;

    public Corrida(int tamanho, List<Veiculo> competidores) {
        this.tamanho = tamanho;
        this.competidores = competidores;
    }

    public void correr() throws InterruptedException {
        while (true) {
            if (acabar())
                break;

            volta();

            Thread.sleep(1000);
        }
    }

    private boolean acabar() {
        for (Veiculo veiculo : competidores) {
            if (veiculo.getPosicao() >= this.tamanho) {
                System.out.println("=========================");
                System.out.println("Vencedor: " + veiculo.getNome());
                System.out.println("=========================");
                return true;
            }
        }
        return false;
    }

    private void volta() {
        String ato;
        for (Veiculo veiculo : competidores) {
            if (Math.random() > 0.5) {
                veiculo.frear();
                ato = "freou";
            } else {
                veiculo.acelerar();
                ato = "acelerou";
            }
            situacao(veiculo, ato);
        }
    }

    private void situacao(Veiculo veiculo, String atoVolta) {
        System.out.println("Veiculo: " + veiculo.getClass().getSimpleName());
        System.out.println("Nome: " + veiculo.getNome());
        System.out.println("Posicao: " + veiculo.getPosicao());
        System.out.println("Nesta volta " + atoVolta);
        System.out.println("=========================");
    }
}
