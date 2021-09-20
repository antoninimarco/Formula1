package it.unicam.cs.pa.Racetrack098994;

import it.unicam.cs.pa.Racetrack098994.controller.Controller;
import it.unicam.cs.pa.Racetrack098994.model.Game;
import it.unicam.cs.pa.Racetrack098994.model.car.Car;
import it.unicam.cs.pa.Racetrack098994.model.car.Color;
import it.unicam.cs.pa.Racetrack098994.model.points.Point;
import it.unicam.cs.pa.Racetrack098994.model.track.Track;
import it.unicam.cs.pa.Racetrack098994.model.track.TrackType;
import it.unicam.cs.pa.Racetrack098994.model.vector.Vector;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertThrows;

public class GameTest {

    @Test
    public void checkGameCreation() {
        assertThrows(NullPointerException.class, () -> new Game(null,new ArrayList<>()));
        assertThrows(NullPointerException.class, () -> new Game(new Track(new ArrayList<>(), TrackType.LINEAR),null));
    }

    @Test
    public void checkControllerCreation() {
        assertThrows(NullPointerException.class, () -> new Controller(null));
    }
}
