package com.tw.wp;

import java.util.ArrayList;

public class Auctioneer implements Subject {

    private ArrayList<Observer> observers;
    private Integer price;

    public Auctioneer() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index >= 0) {
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }

    public void setPrice(Integer price) {
        this.price = price;
        notifyObservers();
    }
}
