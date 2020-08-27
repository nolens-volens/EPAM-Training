package by.atrushkevich.shape.entity;

import static by.atrushkevich.shape.generator.IdGenerator.generateId;

public class Quadrangle {

    private long quadrangleId;
    private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;

    public Quadrangle() {
    }

    public Quadrangle(Point a, Point b, Point c, Point d) {
        this.quadrangleId = generateId();
        this.pointA = a;
        this.pointB = b;
        this.pointC = c;
        this.pointD = d;
    }

    public void setQuadrangleId(long quadrangleId) {
        this.quadrangleId = quadrangleId;
    }

    public long getQuadrangleId() {
        return quadrangleId;
    }

    public Point getA() {
        return pointA;
    }

    public void setA(Point a) {
        this.pointA = a;
    }

    public Point getB() {
        return pointB;
    }

    public void setB(Point b) {
        this.pointB = b;
    }

    public Point getC() {
        return pointC;
    }

    public void setC(Point c) {
        this.pointC = c;
    }

    public Point getD() {
        return pointD;
    }

    public void setD(Point d) {
        this.pointD = d;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (getClass() != o.getClass()) {
            return false;
        }

        Quadrangle q = (Quadrangle) o;
        return this.pointA == q.pointA && this.pointB == q.pointB
                && this.pointC == q.pointC
                && this.pointD == q.pointD
                && this.quadrangleId == q.quadrangleId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        final int prime = 31;
        hash = (int) (prime * hash + this.quadrangleId);
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Quadrangle Id is: ").append(this.quadrangleId).append("\n");
        sb.append("The Point a is: ").append(this.pointA).append("\n");
        sb.append("The Point b is: ").append(this.pointB).append("\n");
        sb.append("The Point c is: ").append(this.pointC).append("\n");
        sb.append("The Point d is: ").append(this.pointD).append("\n");
        return sb.toString();
    }
}
