package com.tw.java;


public class Main {
    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();
        BidderA bidderA = new BidderA(auctioneer);
        BidderB bidderB = new BidderB(auctioneer);
        auctioneer.setPrice(1000);
        auctioneer.setPrice(2000);
        auctioneer.setPrice(3000);
    }
}

