package ru.job4j.array;

import java.util.Arrays;

/**
 * Дано число int. Нужно получить массив из его цифр в обратном порядке.
 * <p>
 * Например
 * <p>
 * 12345 => {5, 4, 3, 2, 1}
 */
public class NumberToArray {
    public static int[] resolve(int number) {
        String strInt = String.valueOf(number);
        int[] arrayInt = new int[strInt.length()];

        for (int index = 0; index < strInt.length(); index++) {
            String strBuffer = strInt.substring(index, index + 1);
            int intBuffer = Integer.valueOf(strBuffer);
            arrayInt[strInt.length() - index - 1] = intBuffer;
        }
        return arrayInt;
    }
}