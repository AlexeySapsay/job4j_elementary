package ru.job4j.condition;

public class Point {

    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int fourth) {
        this.x = first;
        this.y = second;
        this.z = fourth;
    }

    public double distance(Point that) {
        return Math.pow((Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2)), 0.5);
    }

    public double distance3d(Point that) {
        return Math.pow((Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2) + Math.pow((this.z - that.z), 2)), 0.5);
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(2, 2);

        Point a1 = new Point(0, 0, 10);
        Point b1 = new Point(1, 1, 0);

        double distance = a.distance(b);
        double distance3D = a1.distance3d(b1);
        System.out.println(distance);
        System.out.println(distance3D);
    }
}
