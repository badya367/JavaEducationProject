package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.paymentProcessingSystem;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;

    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handlePayment(double amount);

}
