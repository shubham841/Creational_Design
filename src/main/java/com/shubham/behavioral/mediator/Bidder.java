package com.shubham.behavioral.mediator;

public class Bidder implements Colleague{
    String name;
    AuctionMediator mediator;

    public Bidder(String name, AuctionMediator mediator){
        this.name = name;
        this.mediator = mediator;
        mediator.addBidder(this);
    }

    @Override
    public void placeBid(int amount) {
        System.out.println("Bidder: " + name + " placed a bid of $" + amount);
        mediator.placeBid(this, amount);
    }
    @Override
    public void receiveBidNotification(int bidAmount) {
        System.out.println("Bidder: " + name + " received a bid of $" + bidAmount);

    }
    @Override
    public String getName() {
        return name;
    }

}
