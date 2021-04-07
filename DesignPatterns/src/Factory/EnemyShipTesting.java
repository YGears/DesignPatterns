package Factory;

import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args){
        EnemyShipFactory shipFactory = new EnemyShipFactory();

        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? R/U");

        if(userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
            if(theEnemy != null){
                doStuffEnemy(theEnemy);
            } else System.out.println("Please enter U or R next time.");
        }
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip){
        System.out.println("Coming for you!");
        System.out.println(anEnemyShip.getDamage());
        System.out.println(anEnemyShip.getName());
    }

}
