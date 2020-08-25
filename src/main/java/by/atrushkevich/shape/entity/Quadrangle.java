package by.atrushkevich.shape.entity;

import static by.atrushkevich.shape.generator.IdGenerator.generateId;

public class Quadrangle {

    private long quadrangleId;
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrangle() {
    }

    public Quadrangle(Point a, Point b, Point c, Point d) {
        this.quadrangleId = generateId();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void setQuadrangleId(long quadrangleId) {
        this.quadrangleId = quadrangleId;
    }

    public long getQuadrangleId() {
        return quadrangleId;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
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
        return this.a == q.a && this.b == q.b
                && this.c == q.c
                && this.d == q.d
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
        sb.append("The Point a is: ").append(this.a).append("\n");
        sb.append("The Point b is: ").append(this.b).append("\n");
        sb.append("The Point c is: ").append(this.c).append("\n");
        sb.append("The Point d is: ").append(this.d).append("\n");
        return sb.toString();
    }
}
