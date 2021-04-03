package Strategy;

public class Dog extends Animal {
    public Dog(){
        super();
        setFlyingtype(new CantFly());
    }
}
