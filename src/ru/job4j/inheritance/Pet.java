package ru.job4j.inheritance;

public class Pet implements Animal {
    public void vaccinate() {
        System.out.println(Pet.this + " нуждается в прививках, чтобы не болеть.");
    }

    @Override
    public void sound() {

    }
}
