package ru.job4j.array;

public class OddPrint {
    public static void print(int[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 != 0) {
                System.out.println(array[index]);
            }
        }
    }
}
