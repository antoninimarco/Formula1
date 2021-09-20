package it.unicam.cs.pa.Racetrack098994;

import it.unicam.cs.pa.Racetrack098994.model.car.Car;
import it.unicam.cs.pa.Racetrack098994.model.car.Color;
import it.unicam.cs.pa.Racetrack098994.model.points.Point;
import it.unicam.cs.pa.Racetrack098994.model.vector.Vector;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void checkCarCreation() {
        assertThrows(NullPointerException.class, () -> new Car(null, Color.BLACK));
        assertThrows(NullPointerException.class, () -> new Car(new Vector(new Point(0,0),new Point(1,0)), null));
    }

    @Test
    public void checkCarSpeed() {
        Car car = new Car(new Vector(new Point(0,0),new Point(1,0)),Color.BLACK);
        car.setVelocity(5.0);
        assertTrue(car.getVelocity()==5.0);
    }
}
