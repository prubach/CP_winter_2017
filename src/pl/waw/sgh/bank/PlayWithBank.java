package pl.waw.sgh.bank;

import pl.waw.sgh.bank.exceptions.NonExistantAccountException;

import java.math.BigDecimal;

public class PlayWithBank {

    public static void main(String[] args) { //throws NonExistantAccountException {
        Bank bank = new Bank();

        Customer c1 = bank.createCustomer("Anna", "Brown", "anna@ex.com");
        Customer c2 = bank.createCustomer("John", "Smith", "john@ex.com");

        Account acc1 = bank.createDebitAccount(c1);
        Account acc2 = bank.createSavingsAccount(c1);

        Account acc3 = bank.createDebitAccount(c2);
        Account acc4 = bank.createSavingsAccount(c2);

        System.out.println(bank);

        acc1.deposit(252);
        acc2.deposit(300);
        acc2.charge(100);

        //System.err.println("My error message");

        try {
            bank.transfer(88, 0, 80);
            System.out.println(bank);
        } catch (NonExistantAccountException ne) {
            System.out.println("Sth went wrong: " + ne.getMessage());
        }


    }
}
