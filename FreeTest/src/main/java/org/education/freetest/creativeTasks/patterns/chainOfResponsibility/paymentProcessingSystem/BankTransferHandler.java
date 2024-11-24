package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.paymentProcessingSystem;

public class BankTransferHandler extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if (amount < 9999) {
            System.out.println("Платёж обработан через банковский перевод " + amount);
        } else if (nextHandler != null){
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("Невозможно обработать платёж: " + amount);
        }
    }
}
