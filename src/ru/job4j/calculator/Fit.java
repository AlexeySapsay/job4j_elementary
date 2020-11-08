package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 173;
        double man = Fit.manWeight(height);
        System.out.println("Man 173 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 173 is " + woman);

    }
}
