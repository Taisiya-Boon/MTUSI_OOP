package ru.mtusi;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Point3d {

    private double xCoord = 0.0d;
    private double yCoord = 0.0d;
    private double zCoord = 0.0d;

    public Point3d() {
    }

    public Point3d(double x, double y, double z) {
        this.xCoord = x;
        this.yCoord = y;
        this.zCoord = z;
    }

    public double getX() {
        return this.xCoord;
    }

    public double getY() {
        return this.yCoord;
    }

    public double getZ() {
        return this.zCoord;
    }

    public void setX(double x) {
        this.xCoord = x;
    }

    public void setY(double y) {
        this.yCoord = y;
    }

    public void setZ(double z) {
        this.zCoord = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3d point3d = (Point3d) o;
        return Double.compare(point3d.xCoord, xCoord) == 0 &&
                Double.compare(point3d.yCoord, yCoord) == 0 &&
                Double.compare(point3d.zCoord, zCoord) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoord, yCoord, zCoord);
    }

    @Override
    public String toString() {
        return "Point3d(x=" + this.xCoord + ", y=" + this.yCoord + ", z=" + this.zCoord + ")";
    }

    public double distanceTo(Point3d point3d) {
        double distance = Math.sqrt(Math.pow((xCoord - point3d.getX()), 2) +
                Math.pow((yCoord - point3d.getY()), 2) +
                Math.pow((zCoord - point3d.getZ()), 2));
        return new BigDecimal(distance).setScale(2, RoundingMode.CEILING).doubleValue();
    }

}
