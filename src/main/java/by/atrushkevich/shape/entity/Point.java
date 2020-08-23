package by.atrushkevich.shape.entity;


public class Point {

    private long pointId;
    private double coordinateX;
    private double coordinateY;

    public Point() {
    }

    public Point(double coordinateX, double coordinateY) {
        this.pointId = generator.generateId();
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
        return this.coordinateX == point.coordinateX && this.coordinateY == point.coordinateY;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        final int prime = 31;
        hash = (int) (prime * hash + this.coordinateX);
        hash = (int) (prime * hash + this.coordinateY);
        return hash;
    }


}
