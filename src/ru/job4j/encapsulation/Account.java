package ru.job4j.encapsulation;

public class Account {
    private int balance;
    public int offshore;

    public void addMoney(int money) {
        if (money > 0) {
            balance += money;
        }
    }

    public void showMeTheMoney() {
        System.out.println("The balance is : " + balance + " $ ");
    }

    public void grabAllMoney() {
        offshore = balance;
        System.out.println("your money is my! Ha ha ha!");
        balance = 0;
    }
}

