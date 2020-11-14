package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int notNull = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index; /* указатель на null ячейку. */
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        notNull = i;
                        break;
                    }
                }
                swap(array, point, notNull);
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }

    public static String[] swap(String[] array, int space, int word) {
        String buffer = array[space];
        array[space] = array[word];
        array[word] = buffer;
        return array;
    }
}