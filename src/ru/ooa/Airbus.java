package ru.ooa;

public final class Airbus extends Aircraft {
    private static int countEngine = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCountEngine() {
        countEngine = 4;

        System.out.println("Количество двигателей равно: " + countEngine);
    }

    @Override
    public String toString() {
        return ("Airbus" + "{" + "name = " + name + "\\" + "}");
    }
}
