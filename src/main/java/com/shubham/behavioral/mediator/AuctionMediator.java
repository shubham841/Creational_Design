package com.shubham.behavioral.mediator;

public interface AuctionMediator {

    void addBidder(Colleague bidder);
    void placeBid(Colleague bidder, int bidAmount);
}
