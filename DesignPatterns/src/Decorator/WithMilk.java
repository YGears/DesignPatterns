package Decorator;

public class WithMilk extends CoffeeDecorator {


    public WithMilk(Coffee c){
        super(c);
    }

    public double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }

    public String getIngredients() {
        return decoratedCoffee.getIngredients() + ", Milk";
    }
}
