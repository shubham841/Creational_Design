package com.shubham.behavioral.mediator;

public class Main {
    public static void main(String[] args) {

        AuctionMediator mediator = new Auction();

        Colleague bidder1 = new Bidder("Bidder 1", mediator);
        Colleague bidder2 = new Bidder("Bidder 2", mediator);
        Colleague bidder3 = new Bidder("Bidder 3", mediator);

        mediator.addBidder(bidder1);
        mediator.addBidder(bidder2);
        mediator.addBidder(bidder3);

        bidder1.placeBid(100);
        bidder2.placeBid(150);
        bidder3.placeBid(200);
    }
}
