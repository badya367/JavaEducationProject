package org.education.freetest.creativeTasks.patterns.factoryPtrns.bankAccountFactory;

public class InvestmentAccount implements BankAccount{
    private double deposit;
    @Override
    public double deposit() {
        return deposit;
    }

    @Override
    public void withdraw(double howMuch) {
        deposit = deposit - howMuch;
    }

    @Override
    public void put(double howMuch) {
        deposit = deposit + howMuch;
    }
}
