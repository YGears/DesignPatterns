package Adapter;

public class EnemyTank implements EnemyAttacker{

    String className = "The " + this.getClass().getSimpleName();

    @Override
    public void fireWeapon() {
        System.out.println(className +" shoots a big bullet!");
    }

    @Override
    public void driveForward() {
        System.out.println(className + " slowly drives forward");

    }

    @Override
    public void assignDriver(String s) {
        System.out.println("Driver "+ s + " assigned to " + className);

    }
}
