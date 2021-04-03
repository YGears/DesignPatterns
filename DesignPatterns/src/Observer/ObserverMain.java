package Observer;

public class ObserverMain {

    public static void main (String[] args){

        Subject stockSubject = new Subject();

        IBMPrice ibm = new IBMPrice(stockSubject);

       stockSubject.setIBMPrice(197.00f);
        AAPLPrice aapl = new AAPLPrice(stockSubject);
        stockSubject.setAAPLPrice(667.60f);
        stockSubject.getStatus();
 //       stockSubject.setAAPLPrice(677.60f);


    }

}
