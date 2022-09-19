package ru.job4j.early;

public class Main {
    public static void main(String[] args) {
        PasswordValidator passwordValidator = new PasswordValidator();
        System.out.println(passwordValidator.validate("Lllllword1@"));
    }
}
