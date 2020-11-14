package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        int nullIndex = 0;
        int wordIndex = 0;

        for (int counter = 0; counter < array.length; counter++) {
            for (int index = 0; index < array.length; index++) {
                if (array[index] == null) {
                    nullIndex = index; //point to null index
                } else {
                    wordIndex = index;
                }
                if (nullIndex < wordIndex) {
                    swap(array, nullIndex, wordIndex);
                    index = 0;
                }
                //System.out.println(array[index] + " ");
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.println(compressed[index] + " ");
        }
    }

    public static String[] swap(String[] array, int space, int word) {
        String buffer = array[space];
        array[space] = array[word];
        array[word] = buffer;
        return array;
    }
}
