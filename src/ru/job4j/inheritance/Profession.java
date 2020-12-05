package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String profession;
    private int birthday;

    public Profession(String name, String surname, String education, String profession, int birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.profession = profession;
        this.birthday = birthday;
    }

    //bloc Getters initialize
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public String getProfession() {
        return profession;
    }

    public int getBirthday() {
        return birthday;
    }

    //bloc Setter initialize
    // nope, not yet.


}
