package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] array = new int[n];
        array[0] = a;
        array[1] = b;
        int sum = 0;

        for (int index = 2; index < n; index++) {
            sum = 0;
            for (int i = 0; i < index; i++) {
                sum += array[i];
            }
            array[index] = sum;
        }
        return array;
    }
}
