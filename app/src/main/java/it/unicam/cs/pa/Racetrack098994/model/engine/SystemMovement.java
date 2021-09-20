package it.unicam.cs.pa.Racetrack098994.model.engine;

import it.unicam.cs.pa.Racetrack098994.model.points.Point;
import it.unicam.cs.pa.Racetrack098994.model.vector.Vector;

import java.util.Random;

/**
 * classe utilizzata per creare il nuovo vettore di movimento di un giocatore
 * in relazione al suo ultimo vettore.
 */
public class SystemMovement {

    /**
     * Viene usata dal bot per creare un nuovo vettore random a partire da quello precedente
     *
     * @param lastVector vettore precedente
     * @return nuovo vettore
     */
    public static Vector newVector(Vector lastVector) {
        if (lastVector == null) {
            throw new NullPointerException("Ultimo vettore passato nullo");
        }
        int newX = getCoordinataTrasposta(lastVector.getFinish().getX(), lastVector.getStart().getX());
        int newY = getCoordinataTrasposta(lastVector.getFinish().getY(), lastVector.getStart().getY());
        Vector newVector = new Vector(lastVector.getFinish(), new Point(newX + randomNumber(), newY + randomNumber()));
        return newVector;
    }

    /**
     * Metodo utilizzato per creare un nuovo vettore non random a partire da quello precedente (utile per i test)
     *
     * @param lastVector ultimo vettore
     * @return nuovo vettore
     */
    public static Vector newVectorNotRandom(Vector lastVector) {
        if (lastVector == null) {
            throw new NullPointerException("Ultimo vettore passato nullo");
        }
        int newX = getCoordinataTrasposta(lastVector.getFinish().getX(), lastVector.getStart().getX());
        int newY = getCoordinataTrasposta(lastVector.getFinish().getY(), lastVector.getStart().getY());
        Vector newVector = new Vector(lastVector.getFinish(), new Point(newX, newY));
        return newVector;
    }

    /**
     * Utilizzata per creare il punto trasposto di un determinato punto
     *
     * @param end   la coda
     * @param start la testa
     * @return punto trasposto
     */
    private static int getCoordinataTrasposta(int end, int start) {
        int delta = Math.abs(start - end);
        if (end > start)
            return end + delta;
        else if (end < start)
            return end - delta;
        else
            return start;
    }

    /**
     * Utilizzata per restituire 1 0 o -1 in modo random
     *
     * @return 0 1 o -1
     */
    private static int randomNumber() {
        Random ran = new Random();
        int x = ran.nextInt(3) - 1;
        return x;
    }

}
