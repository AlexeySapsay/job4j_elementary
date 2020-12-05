package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int jobHours;
    private int salaryPerHour;

    public Builder(int jobHours, int salaryPerHour) {
        this.jobHours = jobHours;
        this.salaryPerHour = salaryPerHour;
    }

    public void makeHome() {
        System.out.println("Give me a concrete and I make a home for you!");
    }
}
