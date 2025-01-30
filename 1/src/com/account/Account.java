package com.account;


public class Account {
    private String id;
    private String name;
    private int balance = 0; // Default balance set to 0 since everyone starts at zero dollars when an account is opened.

    // Constructor with id and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //  id, name, and initial balance (strings)
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Get methods go here
    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    //  add amount to balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // subtract amount from balance
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    //  transfer amount to another account
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance!!!");
        }
        return balance;
    }

    // using toString to show account details
    @Override
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
