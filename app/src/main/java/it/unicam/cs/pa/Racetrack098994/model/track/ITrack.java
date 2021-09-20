package it.unicam.cs.pa.Racetrack098994.model.track;

import it.unicam.cs.pa.Racetrack098994.model.points.Point;
import it.unicam.cs.pa.Racetrack098994.model.points.PointType;
import it.unicam.cs.pa.Racetrack098994.model.points.TrackPoint;

import java.util.List;

/**
 * Interfaccia che rappresenta un circuito di gara
 */
public interface ITrack {
    /**
     * Ritorna la lista dei punti del circuito
     *
     * @return la lista dei punti del circuito
     */
    List<TrackPoint> getTrackPoints();

    /**
     * Ritorna il tipo di circuito
     *
     * @return il tipo di circuito
     */
    TrackType getTrackType();

    /**
     * Ritorna il tipo del punto
     *
     * @param point punto
     * @return il tipo del punto
     */
    PointType getPointType(Point point);

    /**
     * Ritorna la linea di start
     *
     * @return la linea di start
     */
    List<TrackPoint> getStartLine();
}
