package ru.job4j.inheritance;

public class GuienaPig implements Animal {
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " громко пищит для привлечения внимания.");
    }
}
