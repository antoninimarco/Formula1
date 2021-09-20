package it.unicam.cs.pa.Racetrack098994.model.points;

import java.util.Objects;

public class Point implements IPoint {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        if (x < 0 || y < 0)
            throw new IllegalArgumentException("Le coordinate devono essere positive");
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
