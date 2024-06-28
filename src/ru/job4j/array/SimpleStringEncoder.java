package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == input.charAt(i + 1)) && (i < input.length() - 1)) {
                counter += 1;
            } else {
//                System.out.print(input.charAt(i));
                if (counter != 1 && counter != 0) {
                    System.out.print(input.charAt(i) + String.valueOf(counter));
                    result += input.charAt(i) + String.valueOf(counter);
                }
                System.out.print(input.charAt(i));
                result += input.charAt(i);
                counter = 0;
            }
        }
        if (input.length() == 1) {
            return result + input;
        }
        return input.charAt(1) + String.valueOf(counter);
    }
}
