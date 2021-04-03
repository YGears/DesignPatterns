package Observer;

import java.util.ArrayList;
import java.util.HashMap;

public class Subject implements SubjectInterface {

    private ArrayList<Observer> observers;
    private HashMap<String, Float> price_list = new HashMap<String, Float>();

    public void getStatus(){
        System.out.println("pricelist: " +price_list);
        System.out.println("observers" + observers);
    }

    public Subject(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer" + (observerIndex+1) + "deleted");
        observers.remove(observerIndex);

    }

    @Override
    public void notifyObserver() {

        for(Observer observer : observers){
            observer.update(price_list);
        }

    }
    public void setIBMPrice(float newIBMPrice){
        price_list.put("IBM", newIBMPrice);
        notifyObserver();
    }
    public void setAAPLPrice(float newAAPLPrice){
        price_list.put("AAPL", newAAPLPrice);
        notifyObserver();
    }
}
