import builders.VeiculoBuilder;
import entidades.Veiculo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executando Veículo:");
        executarVeiculo();
    }

    private static void executarVeiculo(){
        Veiculo rondaCivic = new VeiculoBuilder()
                .setTipo("Carro")
                .setCor("Branco")
                .setQuantidadeRodas(2)
                .build();

        System.out.println(rondaCivic.toString());
    }
}