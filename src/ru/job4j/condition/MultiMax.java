package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        first = first > second ? first : second;
        return first > third ? first : third;
    }
}
