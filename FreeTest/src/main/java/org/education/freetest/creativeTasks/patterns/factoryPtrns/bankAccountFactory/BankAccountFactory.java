package org.education.freetest.creativeTasks.patterns.factoryPtrns.bankAccountFactory;

public class BankAccountFactory {


    public static BankAccount createAccount(TypeBankAccounts type){
        BankAccount bankAccount = null;
        switch (type){
            case SAVING:
                bankAccount = new SavingAccount();
                break;
            case CURRENT:
                bankAccount = new CurrentAccount();
                break;
            case INVESTMENT:
                bankAccount = new InvestmentAccount();
                break;
            default:
                throw new IllegalArgumentException("invalid account");

        }
        return bankAccount;
    }
}
