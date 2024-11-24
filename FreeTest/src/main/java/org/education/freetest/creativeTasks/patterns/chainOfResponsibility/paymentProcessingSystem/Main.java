package org.education.freetest.creativeTasks.patterns.chainOfResponsibility.paymentProcessingSystem;

public class Main {
    public static void main(String[] args) {
        PaymentHandler creditCardHandler = new CreditCardHandler();
        PaymentHandler payPalHandler = new PayPalHandler();
        PaymentHandler bankTransferHandler = new BankTransferHandler();

        creditCardHandler.setNextHandler(payPalHandler);
        payPalHandler.setNextHandler(bankTransferHandler);

        creditCardHandler.handlePayment(500);
        creditCardHandler.handlePayment(3000);
        creditCardHandler.handlePayment(7000);
        creditCardHandler.handlePayment(15000 );
    }
}
