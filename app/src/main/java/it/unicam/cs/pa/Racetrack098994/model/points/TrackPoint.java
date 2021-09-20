package it.unicam.cs.pa.Racetrack098994.model.points;

/**
 * classe che estende Point, si occupa di gestire oltre alla locazione del punto anche il tipo del punto.
 */
public class TrackPoint extends Point {
    private final PointType type;

    public TrackPoint(int x, int y, PointType type) {
        super(x, y);
        this.type = type;
    }

    public TrackPoint(Point point) {
        super(point.getX(), point.getY());
        type = PointType.INRACE;
    }

    public PointType getType() {
        return type;
    }

}
