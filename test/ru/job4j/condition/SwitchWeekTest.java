package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class SwitchWeekTest {

    @Test
    public void when1ThenPonedelnik() {
        String result = SwitchWeek.nameOfDay(1);
        assertThat(result, is("Понедельник"));
    }

    @Test
    public void when2ThenVtornik() {
        String result = SwitchWeek.nameOfDay(2);
        assertThat(result, is("Вторник"));
    }

    @Test
    public void when3ThenSreda() {
        String result = SwitchWeek.nameOfDay(3);
        assertThat(result, is("Среда"));
    }

    @Test
    public void when4ThenChetverg() {
        String result = SwitchWeek.nameOfDay(4);
        assertThat(result, is("Четверг"));
    }

    @Test
    public void when5ThenPatnisa() {
        String result = SwitchWeek.nameOfDay(5);
        assertThat(result, is("Пятница"));
    }

    @Test
    public void when6ThenSubbota() {
        String result = SwitchWeek.nameOfDay(6);
        assertThat(result, is("Суббота"));
    }

    @Test
    public void when7ThenWoskresenie() {
        String result = SwitchWeek.nameOfDay(7);
        assertThat(result, is("Воскресенье"));
    }

    @Test
    public void when8ThenOshibka() {
        String result = SwitchWeek.nameOfDay(8);
        assertThat(result, is("Ошибка"));
    }
}