package com.tw.wp;

public class BidderB implements Observer, Say {

    Subject auctioneer;
    private Integer price;

    public BidderB(Subject auctioneer) {
        this.auctioneer = auctioneer;
        auctioneer.registerObserver(this);
    }

    @Override
    public void update(Integer price) {
        this.price = price;
        say();
    }

    @Override
    public void say() {
        System.out.println("I will follow the price:" + this.price);
    }
}
