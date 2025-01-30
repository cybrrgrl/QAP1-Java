package com.account;


public class TestAccount {
    public static void main(String[] args) {
        // two mock accounts with specified balances
        Account acc1 = new Account("A001", "Alice", 5000);
        Account acc2 = new Account("A002", "Bob", 4000);

        // initial balances
        System.out.println("Initial Balances:");
        System.out.println(acc1.getName() + " Balance: " + acc1.getBalance());
        System.out.println(acc2.getName() + " Balance: " + acc2.getBalance());

        // Transferring $1000 from Bob to Alice
        acc1.transferTo(acc2, 1000);

        // Displaying updated balances after transfer
        System.out.println("\nBalances after transfer:");
        System.out.println(acc1.getName() + " Balance: " + acc1.getBalance());
        System.out.println(acc2.getName() + " Balance: " + acc2.getBalance());
    }
}
