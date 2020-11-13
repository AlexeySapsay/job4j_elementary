package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Length input array is: " + numbers[index].length);
        }
    }
}
