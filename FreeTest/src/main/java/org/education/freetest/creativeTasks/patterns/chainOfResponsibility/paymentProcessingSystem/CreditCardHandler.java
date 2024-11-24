package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.paymentProcessingSystem;

public class CreditCardHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount <= 1000){
            System.out.println("Платёж обработан через кредитную карту: " + amount);
        } else if (nextHandler != null){
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("Невозможно обработать платёж: " + amount);
        }
    }
}
