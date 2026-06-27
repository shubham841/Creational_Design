package com.shubham.behavioral.template;

public class PayToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToMerchant");
    }
    @Override
    public void debitAmount() {
        System.out.println("Debit the amount logic of PayToMerchant");

    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the amount logic of PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("Calculate Fees of PayToMerchant");
    }
}
