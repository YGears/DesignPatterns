package Observer;

import java.util.HashMap;

public interface  Observer {
    public void update(HashMap <String, Float> price_list);
}


class IBMPrice implements Observer{

    private double ibmPrice;
    private static int observerIDTracker = 0;
    private Subject stockSubject;

    public IBMPrice (Subject stockSubject){
        this.stockSubject = stockSubject;
        stockSubject.register(this);

        System.out.println("Regsitered IBM Observer");
    }

    @Override
    public void update(HashMap<String, Float> price_list) {

        this.ibmPrice = price_list.get("IBM");
        System.out.println("Recieved new IBM price: "+ ibmPrice);
    }
}


class AAPLPrice implements Observer{
    private double aaplPrice;
    private static int observerIDTracker = 1;
    private Subject stockSubject;

    public AAPLPrice (Subject stockSubject){
        this.stockSubject = stockSubject;
        stockSubject.register(this);

        System.out.println("Regsitered AAPL Observer");
    }

    @Override
    public void update(HashMap<String, Float> price_list) {

        this.aaplPrice = price_list.get("AAPL");
        System.out.println("Recieved new AAPL price: "+ aaplPrice);
    }
}