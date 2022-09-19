package ru.job4j.inheritance;

public class DomesticAnimal implements Animal {
    public void liveOnFarm() {
        System.out.println(DomesticAnimal.this + " живет на ферме, приносит пользу.");
    }

    @Override
    public void sound() {

    }
}
