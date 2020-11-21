package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        int index = 0;

        while (data[index] != el) {
            sum += data[index];
            index += 1;
        }
        return (sum % 2 == 0 ? sum : 0);
    }
}
