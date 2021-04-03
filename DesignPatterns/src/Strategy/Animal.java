package Strategy;

public class Animal {

    private int weight = 0;
    public Flys flyingtype;

    public void setFlyingtype(Flys flyingtype){
        this.flyingtype = flyingtype;
    }

    public void tryToFly(){
        flyingtype.fly();
    }


    public void eat(){
        System.out.println("Hmmmm... yummy!");
    }

    public void setWeight(int food){
        weight = food;
    }
    public void getWeight(){
        System.out.println( "You weigh" + weight + " kilograms... yikes.");
    }


}
