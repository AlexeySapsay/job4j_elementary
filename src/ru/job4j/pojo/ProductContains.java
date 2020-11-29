package ru.job4j.pojo;

public class ProductContains {
    public static void main(String[] args) {
        Product first = new Product("meat", 10);
        Product second = new Product("meat", 10);
        boolean eq = first == second;
        System.out.println(eq);

        boolean eq1 = first.equals(second);
        System.out.println(eq1);
    }
}
