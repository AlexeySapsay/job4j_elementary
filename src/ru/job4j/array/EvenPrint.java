package ru.job4j.array;

public class EvenPrint {
    public static void print(int[] array) {
        for (int index = array.length - 1; index > 0; index--) {
            if (array[index] % 2 == 0) {
                System.out.println(array[index]);
            }
        }
    }
}
