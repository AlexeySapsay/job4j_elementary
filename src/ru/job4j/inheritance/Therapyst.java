package ru.job4j.inheritance;

public class Therapyst extends Doctor {
    private String name = "Ivan";
    private String surname = "Konovalov";
    private String education = "St.Peterburg Medical University";
    private String profession = "Therapyst";
    private int birthday = 22021990;

    public Therapyst(String name, String surname, String education, String profession, int birthday) {
        super(name, surname, education, profession, birthday);
    }

    public String makeATest() {
        return ("Result of test for");
    }

    public String takeAMoneyAndMakeMeHealth() {
        return "*** You are healed! ***";
    }
}
