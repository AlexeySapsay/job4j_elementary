package ru.job4j.condition;

public class Club {
    public static void main(String[] args) {
        permission(true, false);
        permission(false, false);
        permission(false, true);
        permission(true, true);
    }

    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the club.");
        } else {
            System.out.println("I can't.");
        }
    }
}
