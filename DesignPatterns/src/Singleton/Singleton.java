package Singleton;

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){ }
    public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){

            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void setup(){
        System.out.println("Getting singleton...");
        Singleton.getInstance();
        System.out.println("...got singleton: "+ uniqueInstance);
    }
}
