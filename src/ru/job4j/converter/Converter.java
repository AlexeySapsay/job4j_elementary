package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 70; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;

        int expected2 = 2;
        float out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected2 == out2;

        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are 2. Test result : " + passed);

        int dollars = Converter.rubleToDollar(140);
        System.out.println("140 rubles are 2. Test result : " + passed2);

        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollars + " dollars.");

        System.out.println(" ");
    }
}
