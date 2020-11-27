package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFirstName("Alex");
        student.setSecondName("Saps");
        student.setMiddleName("-");
        student.setStudyGroup(11);
        student.setDateStartLearning(new Date());

        System.out.println("Student : " + student.getFirstName() + " " + student.getSecondName()
                + student.getMiddleName() + " Was attempted in group " + student.getStudyGroup()
                + " at :" + student.getDateStartLearning());

    }
}
