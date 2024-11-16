package org.education.freetest.creativeTasks.patterns.factoryPtrns.bankAccountFactory;

public class Main {
    public static void main(String[] args) {
        BankAccount currentAccount = BankAccountFactory.createAccount(TypeBankAccounts.CURRENT);
        System.out.println(currentAccount.deposit());
        currentAccount.put(1000);
        System.out.println(currentAccount.deposit());
        currentAccount.withdraw(200);
        System.out.println(currentAccount.deposit());

        BankAccount savingAccount = BankAccountFactory.createAccount(TypeBankAccounts.SAVING);
        savingAccount.deposit();
        savingAccount.put(1000);
        savingAccount.deposit();
        savingAccount.withdraw(200);
        savingAccount.deposit();

    }
}
