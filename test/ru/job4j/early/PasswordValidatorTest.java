package ru.job4j.early;

import org.junit.Test;

public class PasswordValidatorTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordNullThenThrowException() {
        PasswordValidator.validate(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordLengthNotInDiapasonThenThrowException() {
        PasswordValidator.validate("Passw");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordNotHaveCapitalLetterThenThrowException() {
        PasswordValidator.validate("paaaaassw");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordNotHaveLowerCaseLetterThenThrowException() {
        PasswordValidator.validate("PASSSWWASFS");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordNotHaveDigitalThenThrowException() {
        PasswordValidator.validate("PASSSaSFS");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordNotHaveSpecialCharacterThenThrowException() {
        PasswordValidator.validate("PASSSaSFS5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenPasswordHavePopularPasswordSequenseThenThrowException() {
        PasswordValidator.validate("Qwerty1@");
    }
}