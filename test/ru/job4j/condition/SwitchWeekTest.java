package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SwitchWeekTest {

    @Test
    public void whenFirstMax() {
        String result = SwitchWeek.nameOfDay(1);
        assertThat(result, is("Понедельник"));
    }
}