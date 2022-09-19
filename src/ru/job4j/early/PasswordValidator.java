package ru.job4j.early;

public class PasswordValidator {
    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }

        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password must be in diapason [8, 32]");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must contains one capital letter");
        }

        if (!password.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("Password must contains one lowercase letter");
        }

        if (!password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must contains one digit");
        }

        if (!password.matches(".*[~!@#$%^&*()_+{}:;,.<>/?-].*")) {
            throw new IllegalArgumentException("Password must contains one special character");
        }

        if (containsSubstring(password)) {
            throw new IllegalArgumentException("Password must not contains popular password sequence");
        }
        return password;
    }

    private static boolean containsSubstring(String password) {
        String[] subString = new String[]{"qwerty",
                "12345",
                "password",
                "admin",
                "user"
        };

        for (String str : subString) {
            if (password.toLowerCase().contains(str)) {
                return true;
            }
        }
        return false;
    }
}
