import builders.PizzaBuilder;
import entidades.Pizza;

public class Main {
    public static void main(String[] args) {
        System.out.println("Executando Pizza:");
        executarPizza();

    }

    private static void executarPizza(){
        Pizza queijo = new PizzaBuilder()
                .setMassa("Borda recheada")
                .setTamanho("1m")
                .addIngrediente("Milho, ervilha, tomate, queijo.")
                .build();

        System.out.println(queijo.toString());
    }
}