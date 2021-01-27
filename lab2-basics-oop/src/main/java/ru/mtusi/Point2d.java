package ru.mtusi;

import java.util.Objects;

public class Point2d {

    private double xCoord = 0.0d;

    private double yCoord = 0.0d;

    public Point2d() {

    }

    public Point2d(double xCoord, double yCoord) {
        this.xCoord = xCoord;
        this.yCoord =  yCoord;
    }

    public double getX() {
        return xCoord;
    }

    public double getY() {
        return yCoord;
    }

    public void setX(double x) {
        this.xCoord = x;
    }

    public void setY(double y) {
        this.yCoord = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point2d point2d = (Point2d) o;
        return Double.compare(point2d.xCoord, xCoord) == 0 &&
                Double.compare(point2d.yCoord, yCoord) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoord, yCoord);
    }

    @Override
    public String toString() {
        return "Point2d(x=" + this.xCoord + ", y=" + this.yCoord + ")";
    }

}
