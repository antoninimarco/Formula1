package it.unicam.cs.pa.Racetrack098994.model.bot;

import it.unicam.cs.pa.Racetrack098994.model.car.Car;
import it.unicam.cs.pa.Racetrack098994.model.vector.Vector;

import java.util.List;

/**
 * Gestisce e crea il movimento e lo stato di un giocatore, in particolare il nome, la
 * macchina, lo stato del giocatore e il round.
 */
public interface IBot {
    /**
     * Ritorna il nome del bot
     *
     * @return nome bot
     */
    String getName();

    /**
     * macchina del bot
     *
     * @return macchina del bot
     */
    Car getCar();

    /**
     * status del bot
     *
     * @return status del bot
     */
    BotStatus getStatus();

    /**
     * Imposta lo status del bot
     *
     * @param status nuovo del bot
     */
    void setStatus(BotStatus status);

    /**
     * Ritorna il round generale
     *
     * @return round generale
     */
    int getRound();

    /**
     * Incremento il round generale
     */
    void incrementRound();

    /**
     * movimento della macchina del bot nel circuito
     */
    void move();

    /**
     * restituisce i vettori
     *
     * @return vettori
     */
    List<Vector> getVectors();

    /**
     * restituisce l'ultimo vettore scelto dal bot
     *
     * @return ultimo vettore
     */
    Vector getLastVector();


}
