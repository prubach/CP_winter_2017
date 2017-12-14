package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class PlayWithBank {

    public static void main(String[] args) {
        Bank bank = new Bank();

        Customer c1 = bank.createCustomer("Anna", "Brown", "anna@ex.com");
        Customer c2 = bank.createCustomer("John", "Smith", "john@ex.com");

        Account acc1 = bank.createDebitAccount(c1);
        Account acc2 = bank.createSavingsAccount(c1);

        Account acc3 = bank.createDebitAccount(c2);
        Account acc4 = bank.createSavingsAccount(c2);

        System.out.println(bank);
    }
}
