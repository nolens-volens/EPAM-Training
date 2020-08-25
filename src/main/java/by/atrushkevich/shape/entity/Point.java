package by.atrushkevich.shape.entity;

import static by.atrushkevich.shape.generator.IdGenerator.generateId;

public class Point {

    private long pointId;
    private double coordinateX;
    private double coordinateY;

    public Point() {
    }

    public Point(double coordinateX, double coordinateY) {
        this.pointId = generateId();
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public long getPointId() {
        return pointId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        Point point = (Point) o;
        return this.coordinateX == point.coordinateX && this.coordinateY == point.coordinateY
                && this.pointId == point.pointId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        final int prime = 31;
        hash = (int) (prime * hash + this.coordinateX);
        hash = (int) (prime * hash + this.coordinateY);
        hash = (int) (prime * hash + this.pointId);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Point Id is: ").append(this.pointId).append("\n");
        sb.append("Coordinate X is: ").append(this.coordinateX).append("\n");
        sb.append("Coordinate Y is: ").append(this.coordinateY).append("\n");
        return sb.toString();
    }
}
