package it.unicam.cs.pa.Racetrack098994.model;

import it.unicam.cs.pa.Racetrack098994.model.bot.Bot;
import it.unicam.cs.pa.Racetrack098994.model.track.Track;

import java.util.List;

/**
 * Gestisce la gara, la sua conclusione, il suo corretto svolgimento e la relazione
 * tra giocatori e circuito
 */
public interface IGame {
    /**
     * Ritorna il circuito
     *
     * @return circuito
     */
    Track getTrack();

    /**
     * Ritorna i bot
     *
     * @return i bot
     */
    List<Bot> getBots();

    /**
     * Ritorna lo stato del gioco
     *
     * @return stato del gioco
     */
    String getStatus();

    /**
     * Controlla se il gioco e finito o no
     *
     * @return vero se e finito falso se non e finito
     */
    boolean isFinish();

    /**
     * Conclude il gioco
     */
    void finishGame();

    /**
     * Ritorna il round generale del gioco
     *
     * @return il round generale del gioco
     */
    int getRound();

    /**
     * Incrementa il round generale
     */
    void incrementRound();

    /**
     * Per controllare se è rimasto almeno un giocatore in gara
     *
     * @return vero se c'e uno o piu giocatori in gara altrimenti false
     */
    boolean isAtLeastOnePlayerInGame();
}