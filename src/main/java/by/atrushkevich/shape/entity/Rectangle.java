package by.atrushkevich.shape.entity;


import static by.atrushkevich.shape.generator.IdGenerator.generateId;

public class Rectangle {

    private long rectangleId;
    private Point point;
    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(Point point) {
        this.rectangleId = generateId();
        this.point = point;
    }

    public void setRectangleId(long rectangleId) {
        this.rectangleId = rectangleId;
    }

    public long getRectangleId() {
        return rectangleId;
    }
}
