package ru.job4j.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;

        for (int index = 0; index < data.length; index++) {
            sum += data[index];
        }
        return (sum % 2 == 0 ? true : false);
    }
}
