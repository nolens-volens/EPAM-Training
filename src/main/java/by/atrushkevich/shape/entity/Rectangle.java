package by.atrushkevich.shape.entity;


public class Rectangle {

    private int rectangleId;
    private Point point;
    private int height;
    private int width;

    public Rectangle() {
    }

    public Rectangle(Point point) {
        this.rectangleId = generator.generateId();
        this.point = point;
    }

    public void setRectangleId(int rectangleId) {
        this.rectangleId = rectangleId;
    }

    public int getRectangleId() {
        return rectangleId;
    }
}
