package Adapter;

public class EnemyRobot {

    String className = "The " + this.getClass().getSimpleName();

    public void smashWithHands(){
        System.out.println(className + " smashes everything!");
    }
    public void walkForward(){
        System.out.println(className + " takes a couple steps...");
    }
    public void reactToHuman(String s){

        System.out.println("What are you doing to me " + s + "? Said the " + className);

    }

}
