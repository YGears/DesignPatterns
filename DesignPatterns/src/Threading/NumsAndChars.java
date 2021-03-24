package Threading;

public class NumsAndChars implements Runnable {

    private char car;
    private int times;


    public NumsAndChars (char car, int t){
        this.car = car;
        times = t;

    }

    @Override
    public void run() {
        for(int i = 0; i<= times; i++){
            System.out.println(car);
        }
    }
}
