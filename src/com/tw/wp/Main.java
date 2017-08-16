package com.tw.wp;

public class Main {

    public static void main(String[] args) {
        Auctioneer auctioneer = new Auctioneer();

        BidderA bidderA = new BidderA(auctioneer);
        BidderB bidderB = new BidderB(auctioneer);
        auctioneer.setPrice(100);
        auctioneer.setPrice(200);
        auctioneer.setPrice(300);
    }
}
