package ru.job4j.array;

public class TestRemoveit {
    public static void main(String[] args) {
        System.out.println(method(10, 5));
    }

    public static long method(long a, long b) {
        if (b == 0) {
            return b;
        }
        return a + method(a, b - 1);
    }
}
