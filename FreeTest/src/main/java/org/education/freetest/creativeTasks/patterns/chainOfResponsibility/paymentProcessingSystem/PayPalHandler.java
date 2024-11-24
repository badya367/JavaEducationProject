package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.paymentProcessingSystem;

public class PayPalHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount <= 5000) {
            System.out.println("Платёж обработан через PayPal: " + amount);
        } else if (nextHandler != null){
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("Невозможно обработать платёж: " + amount);
        }
    }
}
