package it.unicam.cs.pa.Racetrack098994;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import it.unicam.cs.pa.Racetrack098994.model.points.Point;
import it.unicam.cs.pa.Racetrack098994.model.engine.SystemMovement;
import it.unicam.cs.pa.Racetrack098994.model.points.PointType;
import it.unicam.cs.pa.Racetrack098994.model.points.TrackPoint;
import it.unicam.cs.pa.Racetrack098994.model.vector.Vector;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SystemMovementTest {

    @Test
    public void checkVectorCreation() {
        Vector vector = new Vector(new Point(0,0), new Point(10,10));
        assertEquals(vector,(new Vector(new Point(0,0), new Point(10,10))));
    }

    @Test
    public void checkNewVector(){
        Vector vector = new Vector(new Point(0,0), new Point(10,10));
        assertEquals((new Vector(new Point(10,10), new Point(20,20))), SystemMovement.newVectorNotRandom(vector));
    }

    @Test
    public void checkNewVectorRandom(){
        Vector vector = new Vector(new Point(0,0), new Point(10,10));
        Vector vector1 = new Vector(new Point(10,10), new Point(20,20));
        Vector vector2 = new Vector(new Point(10,10), new Point(19,19));
        Vector vector3 = new Vector(new Point(10,10), new Point(19,20));
        Vector vector4 = new Vector(new Point(10,10), new Point(20,19));
        Vector vector5 = new Vector(new Point(10,10), new Point(21,21));
        Vector vector6 = new Vector(new Point(10,10), new Point(20,21));
        Vector vector7 = new Vector(new Point(10,10), new Point(21,20));
        Vector vector8 = new Vector(new Point(10,10), new Point(19,21));
        Vector vector9 = new Vector(new Point(10,10), new Point(21,19));

        Vector vectorFinal = SystemMovement.newVector(vector);
        List<Vector> vectors = new ArrayList<Vector>();
        vectors.add(vector1);
        vectors.add(vector2);
        vectors.add(vector3);
        vectors.add(vector4);
        vectors.add(vector5);
        vectors.add(vector6);
        vectors.add(vector7);
        vectors.add(vector8);
        vectors.add(vector9);

        List<Vector> result = vectors.stream().filter(vec -> vec.equals(vectorFinal)).collect(Collectors.toList());
        assertTrue(result.size()==1);
    }


    @Test
    public void equalsBetweenPointsAndTrackPoint() {
        Point point = new Point(0,0);
        TrackPoint trackPoint = new TrackPoint(0,0, PointType.START);
        assertEquals(new TrackPoint(point),trackPoint);
    }

}
