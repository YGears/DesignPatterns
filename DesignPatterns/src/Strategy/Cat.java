package Strategy;

public class Cat extends Animal{
    public Cat(){
        super();
        setFlyingtype(new ItFlies());
    }
}
