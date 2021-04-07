package Factory;

public abstract class EnemyShip {

    private String name;
    private double speed;
    private double amtDamage;

    public String getName(){return name;}
    public void setName(String newName){name = newName;}

    public double getDamage(){return amtDamage;}
    public void setDamage(double newDamage){amtDamage = newDamage;}


}
