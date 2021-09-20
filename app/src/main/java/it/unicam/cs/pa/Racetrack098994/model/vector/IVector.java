package it.unicam.cs.pa.Racetrack098994.model.vector;

import it.unicam.cs.pa.Racetrack098994.model.points.Point;

/**
 * si occupa di gestire la lunghezza di un vettore, dotati di un inizio e una fine
 */
public interface IVector {
    /**
     * Punto di inizio del vettore
     *
     * @return punto iniziale del vettore
     */
    Point getStart();

    /**
     * Punto finale del vettore
     *
     * @return punto finale del vettore
     */
    Point getFinish();

    /**
     * Ritorna la lunghezza tra 2 punti
     *
     * @return lunghezza tra 2 punti
     */
    double getLength();
}