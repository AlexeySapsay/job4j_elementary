package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int remainder = money - price;

        for (int i = 0; i < coins.length; i++) {
            while ((remainder >= coins[i]) && (remainder > 0)) {
                remainder = remainder - coins[i];
                rsl[size] = coins[i];
                size += 1;
            }
        }

        return Arrays.copyOf(rsl, size);
    }
}