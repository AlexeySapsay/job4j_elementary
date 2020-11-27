package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String firstName;
    private String secondName;
    private String middleName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(int studyGroup) {
        this.studyGroup = studyGroup;
    }

    public Date getDateStartLearning() {
        return dateStartLearning;
    }

    public void setDateStartLearning(Date dateStartLearning) {
        this.dateStartLearning = dateStartLearning;
    }

    private int studyGroup;
    private Date dateStartLearning;
}
