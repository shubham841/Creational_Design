package com.shubham.behavioral.template;

public class Main {

    //When you want all classes to follow specific steps to process the tasks but provide flexibility that each class can have their own logic in that specific
    // step.

    public static void main(String[] args) {
        PaymentFlow paymentFlow = new PayToFriend();
        paymentFlow.sendPayment();
    }


}
