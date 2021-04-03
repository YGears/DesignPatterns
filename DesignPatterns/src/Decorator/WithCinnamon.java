package Decorator;

public class WithCinnamon extends CoffeeDecorator{


    public WithCinnamon(Coffee c){
        super(c);
    }

    public double getCost() {
        return decoratedCoffee.getCost() + .7;
    }

    public String getIngredients() {
        return decoratedCoffee.getIngredients() + ", Cinnamon";
    }
}
