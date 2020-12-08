package ru.job4j.inheritance;

public class PolyUsage {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goose = new Goose();
        Animal dog = new Dog();
        Animal guineaPig = new GuienaPig();

        Animal[] animals = new Animal[]{cow, goose, dog, guineaPig};
        for (Animal element : animals) {
            element.sound();
        }
    }
}
