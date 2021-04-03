package Observer;

public interface SubjectInterface {
    public void register(Observer o);
    public void unregister(Observer o);
    public void notifyObserver();
}
