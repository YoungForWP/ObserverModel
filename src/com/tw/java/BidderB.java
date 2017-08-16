package com.tw.java;

import java.util.Observable;
import java.util.Observer;

public class BidderB implements Observer, Say {

    Observable observable;
    private Integer price;

    public BidderB(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Auctioneer) {
            Auctioneer auctioneer = (Auctioneer) o;
            this.price = auctioneer.getPrice();
            Say();
        }
    }

    @Override
    public void Say() {
        System.out.println("I will follow the price:" + this.price);
    }
}
