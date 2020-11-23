package ru.job4j.condition;

//import java.lang.Math.sqrt;
//import java.lang.Math.pow;

public class Point {

    private int x;
    private int y;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public double distance(Point that) {
        return Math.pow((Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2)), 0.5);
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);

        double distance = a.distance(b);
        System.out.println(distance);
    }

}
