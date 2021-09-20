package it.unicam.cs.pa.Racetrack098994;

import it.unicam.cs.pa.Racetrack098994.model.points.Point;
import it.unicam.cs.pa.Racetrack098994.model.points.PointType;
import it.unicam.cs.pa.Racetrack098994.model.points.TrackPoint;
import it.unicam.cs.pa.Racetrack098994.model.track.Track;
import it.unicam.cs.pa.Racetrack098994.model.track.TrackType;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TrackTest {

    @Test
    public void checkTrackCreation() {
        assertThrows(NullPointerException.class, () -> new Track(null, TrackType.LINEAR));
        assertThrows(NullPointerException.class, () -> new Track(new ArrayList<>(), null));
    }

    @Test
    public void checkPointCreation() {
        assertThrows(IllegalArgumentException.class, () -> new Point(-3,0));
        assertThrows(IllegalArgumentException.class, () -> new Point(0,-45));
        assertEquals(new TrackPoint(0,0, PointType.INRACE),new TrackPoint(0,0,PointType.FINISH));
    }

}
