package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class PlayWithBank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer c1 = new Customer(1, "Anna", "Brown", "anna@ex.com");
        Customer c2 = new Customer(2, "John", "Smith", "john@ex.com");

        Account acc1 = new DebitAccount(1, 100d, c1);
        Account acc2 = new SavingsAccount(2, 200d, c1);

        Account acc3 = new DebitAccount(3, 300d, c2);
        Account acc4 = new SavingsAccount(4, 500d, c2);
        bank.getAccountList().add(acc1);
        bank.getAccountList().add(acc2);
        //bank.

    }
}
