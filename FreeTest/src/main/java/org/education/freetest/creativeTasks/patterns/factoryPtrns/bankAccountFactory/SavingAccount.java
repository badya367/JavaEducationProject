package org.education.freetest.creativeTasks.patterns.factoryPtrns.bankAccountFactory;

public class SavingAccount implements BankAccount{
    private double deposit;
    @Override
    public double deposit() {
        System.out.println("Ваш баланс сберегательного счёта: " + deposit + "$");
        return deposit;
    }

    @Override
    public void withdraw(double howMuch) {
        if(howMuch > deposit){
            throw new IllegalArgumentException("insufficient funds in the account");
        }
        deposit = deposit - howMuch;
        System.out.println("Вы сняли с сбергательного счёта: " + howMuch + "$");
    }

    @Override
    public void put(double howMuch) {
        deposit = deposit + howMuch;
        System.out.println("Вы положили на сберегательный счёт: " + howMuch + "$");
    }
}
