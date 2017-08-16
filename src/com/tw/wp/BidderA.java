package com.tw.wp;

public class BidderA implements Observer, Say{

    Subject auctioneer;
    private Integer price;

    public BidderA(Subject auctioneer) {
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
        System.out.println("The current price is " + this.price);
    }
}
