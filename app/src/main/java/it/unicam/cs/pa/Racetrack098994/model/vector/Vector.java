package it.unicam.cs.pa.Racetrack098994.model.vector;

import it.unicam.cs.pa.Racetrack098994.model.points.Point;

import java.util.Objects;

public class Vector implements IVector {
    private final Point start;
    private final Point finish;
    private final double length;

    public Vector(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
        this.length = initializeLength();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Objects.equals(start, vector.start) && Objects.equals(finish, vector.finish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, finish);
    }

    private double initializeLength() {
        int x1 = start.getX();
        int x2 = finish.getX();
        int y1 = start.getY();
        int y2 = finish.getY();
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }


    @Override
    public Point getStart() {
        return start;
    }

    @Override
    public Point getFinish() {
        return finish;
    }

    @Override
    public double getLength() {
        return length;
    }

}
