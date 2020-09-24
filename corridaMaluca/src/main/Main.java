package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Veiculo> competidores = new ArrayList<>();

        Aviao tecoteco = new Aviao(10, "Tecoteco", "Avua rapidao", 30);
        Caminhao caminhao = new Caminhao(5, "Vrum vrum", "pesadao",
                "slick", 8);
        Carro carrinho = new Carro(8, "carrim", "roncao brabo", "duro");

        competidores.add(tecoteco);
        competidores.add(caminhao);
        competidores.add(carrinho);

        Corrida corrida = new Corrida(50, competidores);
        corrida.correr();
    }
}
