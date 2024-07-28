package observerdesign;

import java.util.ArrayList;

public class ScoreSubject {
    ArrayList<Observer> observers;

    public ScoreSubject() {
        observers = new ArrayList<>();
    }

    public void register(Observer obj) {
        observers.add(obj);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
