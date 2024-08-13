package onlineauction;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Subject {
    private List<Observer> observers;
    private String item;
    private boolean biddingStarted;
    private boolean biddingEnded;

    public Auction(String item) {
        this.item = item;
        this.observers = new ArrayList<>();
        this.biddingStarted = false;
        this.biddingEnded = false;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void startBidding() {
        if (!biddingStarted && !biddingEnded) {
            biddingStarted = true;
            notifyObservers("Bidding has started for item: " + item);
        }
    }

    public void endBidding() {
        if (biddingStarted && !biddingEnded) {
            biddingEnded = true;
            notifyObservers("Bidding has ended for item: " + item);
        }
    }

    public void itemAvailable() {
        notifyObservers("Item available: " + item);
    }
}

