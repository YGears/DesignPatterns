package Strategy;

public class Main {

    public static void main(String[] args){
        System.out.println("Hello world!");
        System.out.println("Does it really? ");

        Animal sparky = new Dog();
        sparky.eat();
        sparky.getWeight();
        sparky.tryToFly();

        Animal poekie = new Cat();
        poekie.setWeight(60);
        poekie.getWeight();
        poekie.tryToFly();
        poekie.setFlyingtype(new CantFly());
        poekie.tryToFly();




    }
}
