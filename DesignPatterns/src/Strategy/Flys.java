package Strategy;

public interface Flys {

    void fly();
}

class ItFlies implements Flys{

    @Override
    public void fly() {
        System.out.println("I am flying high!");
    }
}

class CantFly implements Flys{

    @Override
    public void fly() {
        System.out.println("I am falling quickly!");
    }
}

