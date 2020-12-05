package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int price;
    private int guarantyYear;

    public Dentist(int price, int guarantyYear) {
        this.price = price;
        this.guarantyYear = guarantyYear;
    }

    public void makeTeeth(int price, int guarantyYear) {
        System.out.println("I take your money and make teeth for your");
        System.out.println("See your later!");
    }
}
