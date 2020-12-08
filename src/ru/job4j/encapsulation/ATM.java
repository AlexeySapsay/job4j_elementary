package ru.job4j.encapsulation;

public class ATM {
    public static void main(String[] args) {
        Account account = new Account();
        account.addMoney(10000);
        account.showMeTheMoney();
        account.grabAllMoney();
        account.showMeTheMoney();
    }
}

