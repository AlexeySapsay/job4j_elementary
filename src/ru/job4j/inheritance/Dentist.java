package ru.job4j.inheritance;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, String profession, int birthday) {
        super(name, surname, education, profession, birthday);
    }
//    private int price;
//    private int guarantyYear;
//
//    public Dentist(int price, int guarantyYear) {
//        super(price, guarantyYear, name, surname);
//        this.price = price;
//        this.guarantyYear = guarantyYear;
//    }
//
//    public void makeTeeth(int price, int guarantyYear) {
//        System.out.println("I take your money and make teeth for your");
//        System.out.println("See your later!");
//    }
}
