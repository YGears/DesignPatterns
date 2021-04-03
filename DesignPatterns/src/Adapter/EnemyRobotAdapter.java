package Adapter;

public class EnemyRobotAdapter implements EnemyAttacker {

    private EnemyRobot enemyRobot;

    public EnemyRobotAdapter(EnemyRobot robot){
        this.enemyRobot = robot;

    }

    @Override
    public void fireWeapon() {
        enemyRobot.smashWithHands();
    }

    @Override
    public void driveForward() {
        enemyRobot.walkForward();
    }

    @Override
    public void assignDriver(String s) {
        enemyRobot.reactToHuman(s);
    }
}
