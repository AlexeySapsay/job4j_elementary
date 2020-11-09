package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int max;
        if (first > second) {
            max = first;
            if (max > third) {
                return max;
            } else {
                return third;
            }
        } else {
            max = second;
            if (max > third) {
                return max;
            } else {
                return third;
            }
        }
    }
}
