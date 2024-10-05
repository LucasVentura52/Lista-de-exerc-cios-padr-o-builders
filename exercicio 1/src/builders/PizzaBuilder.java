package builders;
import entidades.Pizza;

public class PizzaBuilder {
    private Pizza pizza = new Pizza();

    public PizzaBuilder setMassa(String massa){
        this.pizza.setMassa(massa);
        return this;
    }

    public PizzaBuilder setTamanho(String tamanho){
        this.pizza.setTamanho(tamanho);
        return this;
    }

    public PizzaBuilder addIngrediente(String ingredientes){
        this.pizza.addIngredientes(ingredientes);
        return this;
    }

    public Pizza build(){
        return this.pizza;}
}
