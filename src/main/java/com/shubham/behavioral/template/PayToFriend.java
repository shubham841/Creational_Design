package com.shubham.behavioral.template;

public class PayToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToFriend");
    }
    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic of PayToFriend");

    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the amount logic of PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate Fees of PayToFriend");
    }
}
