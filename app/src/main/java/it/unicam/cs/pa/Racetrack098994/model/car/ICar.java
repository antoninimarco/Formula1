package it.unicam.cs.pa.Racetrack098994.model.car;

import it.unicam.cs.pa.Racetrack098994.model.vector.Vector;

/**
 * Interfaccia per tenere traccia dei movimenti e delle caratteristiche della macchina
 */
public interface ICar {
    /**
     * Ritorna il colore della macchina
     *
     * @return
     */
    Color getColor();

    /**
     * Ritorna il primo vettore
     *
     * @return primo vettore
     */
    Vector getFirstVector();

    /**
     * Ritorna la velocita della macchina
     *
     * @return velocita della macchina
     */
    double getVelocity();

    /**
     * Imposta la velocita aggiornata
     *
     * @param velocity nuova velocita
     */
    void setVelocity(double velocity);

}
