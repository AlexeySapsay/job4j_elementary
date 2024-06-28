package ru.job4j.array;

public class StringUsage {
    //    public static void main(String[] args) {
//        String first = "aaabvddrr";
//        System.out.println("Length of string FIRST: " + first.length());
//        String second = "aaabbbvdddrrr";
//        System.out.println("Length of string SECOND: " + second.length());
//        String third = "abbvdddr";
//        System.out.println("Length of string THIRD: " + third.length());
//    }
    public static void main(String[] args) {
        String first = "aaabvddrr";
        System.out.println("Length of string FIRST: " + first.length());
        System.out.println(SimpleStringEncoder.encode(first));
        String second = "aaabbbvdddrrr";
        System.out.println("Length of string SECOND: " + second.length());
        System.out.println(SimpleStringEncoder.encode(second));
        String third = "abbvdddr";
        System.out.println("Length of string THIRD: " + third.length());
        System.out.println(SimpleStringEncoder.encode(third));
    }
}
