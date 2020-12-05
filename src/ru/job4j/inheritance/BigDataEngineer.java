package ru.job4j.inheritance;

public class BigDataEngineer extends Engineer {
    private int salary;
    private int dataGigabyte;
    private int server;

    public BigDataEngineer(int salary, int dataGigabyte, int server) {
        super(salary, dataGigabyte, server);
        this.salary = salary;
        this.dataGigabyte = dataGigabyte;
        this.server = server;
    }

    public void makeABigDataServer() {
        System.out.println("Server is starting");
        System.out.println("The Data is ready for your idea");
    }
}
