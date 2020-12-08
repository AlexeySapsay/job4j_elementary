package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                return rsl;
            }
        }
        throw new ElementNotFoundException();
    }

    public static void main(String[] args) {
        try {
            System.out.println(indexOf(new String[]{"10", "20", "30"}, "0"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
