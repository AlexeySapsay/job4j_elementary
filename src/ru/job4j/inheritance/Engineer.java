package ru.job4j.inheritance;

public class Engineer extends Profession {
    public Engineer(String name, String surname, String education, String profession, int birthday) {
        super(name, surname, education, profession, birthday);
    }

    public Engineer(int salary, int dataGigabyte, int server) {
        super(salary, dataGigabyte, server);
    }

    public Engineer(int giveATerabyteData, int giveComputer) {
        super(giveATerabyteData, giveComputer);
    }
}
