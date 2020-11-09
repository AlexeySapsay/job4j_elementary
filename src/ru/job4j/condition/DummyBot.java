package ru.job4j.condition;

public class DummyBot {
    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);

        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);

        rsl = DummyBot.answer("Как тебя зовут, Бот?");
        System.out.println(rsl);
    }

    public static String answer(String question) {
        String rsl = "";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
            return rsl;
        }
        if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
            return rsl;
        }
        rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        return rsl;
    }
}
