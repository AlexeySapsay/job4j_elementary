package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int index = 0; index < 4; index++) {
            numbers[index] = index * 2 + 3;
        }

        for (int elemnt : numbers) {
            System.out.println(elemnt);
        }
    }
}
