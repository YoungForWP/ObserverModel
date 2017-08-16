package com.tw.java;

import java.util.Observable;

public class Auctioneer extends Observable {

    private Integer price;

    public void setPrice(Integer price) {
        this.price = price;
        priceChanged();
    }

    public Integer getPrice() {
        return price;
    }

    private void priceChanged() {
        setChanged();
        notifyObservers();
    }

}
