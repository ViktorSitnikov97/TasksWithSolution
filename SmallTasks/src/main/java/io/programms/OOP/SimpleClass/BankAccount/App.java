package io.programms.OOP.SimpleClass.BankAccount;

public class App {
    public static void main(String[] args) {
        var account = new BankAccount(123, "eur", 10);

        account.deposit("eur", 10);
        System.out.println(account.getBalance()); // 20

        account.deposit("usd", 12);
        System.out.println(account.getBalance()); // 30

        account.withdraw("usd", 24);
        System.out.println(account.getBalance()); // 10

        account.withdraw("eur", 10);
        System.out.println(account.getBalance()); // 0

    }
}
