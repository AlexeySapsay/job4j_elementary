package ru.job4j.inheritance;

import ru.job4j.array.SortSelected;

public class MashineLearningEngineer extends Engineer {
    private int giveATerabyteData;
    private int giveComputer;

    public MashineLearningEngineer(int giveATerabyteData, int giveComputer) {
        super(giveATerabyteData, giveComputer);
        this.giveATerabyteData = giveATerabyteData;
        this.giveComputer = giveComputer;
    }

    public void makeAModel(int giveATerabyteData, int giveComputer) {
        System.out.println("I training NeyroNet and that is result!");
        System.out.println("Take a data for your startup!");
    }
}
