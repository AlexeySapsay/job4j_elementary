package ru.job4j.condition;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(exist(2, 2, 2));
        System.out.println(exist(3, 3, 3));
        System.out.println(exist(0, 0, 0));
    }

    public static boolean exist(double ab, double ac, double bc) {
        return (((ab + bc) > ac) && ((bc + ac) > ab) && ((ac + ab) > bc));
    }
}
