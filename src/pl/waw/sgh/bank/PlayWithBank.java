package pl.waw.sgh.bank;

import pl.waw.sgh.bank.exceptions.BankException;

public class PlayWithBank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer c1 = bank.createCustomer("Anne", "Brown", "anne@brown.com");
        Customer c2 = bank.createCustomer("John", "Smith", "john@smith.com");

        Account acc1 = bank.createAccount(c1, false);
        Account acc2 = bank.createAccount(c1, true);
        Account acc3 = bank.createAccount(c2, false);
        Account acc4 = bank.createAccount(c2, true);

        acc1.deposit(100);
        /**
         * CASE ONE - FOR WRONG ACCOUNT ID
         */
        try {
            bank.transfer(1110, 1, 10);
            System.out.println(bank);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }

        /**
         * CASE TWO - NEGATIVE AMOUNT
         */
        try {
            bank.transfer(0, 1, -10);
            System.out.println(bank);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
    }
}
