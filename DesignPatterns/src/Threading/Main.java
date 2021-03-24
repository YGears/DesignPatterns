package Threading;

public class Main {

    public static void main(String[] args){

        Runnable cartoprinta = new NumsAndChars('a', 20);
        Runnable cartoprintb = new NumsAndChars('b', 20);
        Runnable cartoprintc = new NumsAndChars('c', 20);


        Thread dhread1 =  new Thread(new NumsAndChars('a', 20));
        Thread dhread2 =  new Thread(cartoprintb);
        Thread dhread3 =  new Thread(cartoprintc);

        dhread1.start();
        dhread2.start();
        dhread3.start();


}}
