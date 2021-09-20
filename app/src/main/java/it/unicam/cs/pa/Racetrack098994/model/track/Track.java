package it.unicam.cs.pa.Racetrack098994.model.track;


import it.unicam.cs.pa.Racetrack098994.model.points.Point;
import it.unicam.cs.pa.Racetrack098994.model.points.PointType;
import it.unicam.cs.pa.Racetrack098994.model.points.TrackPoint;

import java.util.ArrayList;
import java.util.List;

public class Track implements ITrack {
    private final List<TrackPoint> trackPoints;
    private final TrackType type;

    public Track(List<TrackPoint> trackPoints, TrackType type) {
        if (trackPoints== null)
            throw new NullPointerException("i punti non devono essere nulli");
        if (type== null)
            throw new NullPointerException("il tipo non deve essere nullo");
        this.trackPoints = trackPoints;
        this.type = type;
    }


    @Override
    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    @Override
    public TrackType getTrackType() {
        return type;
    }

    @Override
    public PointType getPointType(Point point) {
        TrackPoint trackPoint = new TrackPoint (point);
        for (int i = 0; i < trackPoints.size() ; i++) {
            if(trackPoints.get(i).equals(trackPoint)) {
                return trackPoints.get(i).getType();
            }
        }
        return PointType.OUTROAD;
    }

    @Override
    public List<TrackPoint> getStartLine() {
        List<TrackPoint> start = new ArrayList<>();
        for (int i = 0; i < trackPoints.size(); i++) {
            if (trackPoints.get(i).getType()==PointType.START) {
                start.add(trackPoints.get(i));
            }
        }
        return start;
    }
}

