package ru.job4j.pojo;

public class Book {
    private String name;
    private int lists;

    public Book(String name, int lists) {
        this.name = name;
        this.lists = lists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLists() {
        return lists;
    }

    public void setLists(int lists) {
        this.lists = lists;
    }
}
