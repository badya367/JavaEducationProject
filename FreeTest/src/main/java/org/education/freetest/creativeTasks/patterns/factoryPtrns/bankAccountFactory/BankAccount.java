package org.education.freetest.creativeTasks.patterns.factoryPtrns.bankAccountFactory;

public interface BankAccount {
    double deposit();
    void withdraw(double howMuch);
    void put(double howMuch);
}
