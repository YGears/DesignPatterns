package Adapter;

public class AdapterMain {
    public static void main(String[] args){

        EnemyTank tank = new EnemyTank();
        tank.fireWeapon();
        tank.driveForward();
        tank.assignDriver("Johnny");

        EnemyRobot robocop = new EnemyRobot();
        EnemyRobotAdapter adapter = new EnemyRobotAdapter(robocop);
        adapter.driveForward();
        adapter.fireWeapon();
        adapter.assignDriver("Steve");

    }
}
