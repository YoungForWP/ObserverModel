package com.tw.java;

import java.util.Observable;
import java.util.Observer;

public class BidderA implements Observer, Say {

    Observable observable;
    private Integer price;

    public BidderA(Observable observable) {
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
        System.out.println("The current price is " + this.price);
    }
}
