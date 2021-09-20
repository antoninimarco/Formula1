package it.unicam.cs.pa.Racetrack098994.controller;

import it.unicam.cs.pa.Racetrack098994.model.Game;

import java.io.FileNotFoundException;

/**
 * Gestisce il gioco, crea la gara e controlla ogni singola azione del gioco
 */
public interface IController {

    /**
     * Ritorna il gioco
     *
     * @return gioco
     */
    Game getGame();

    /**
     * Ritorna uno stato del gioco co tutte le informazioni
     *
     * @return stato gioco
     */
    String getStatus();

    /**
     * Ritorna la mossa effettuta e il suo stato
     *
     * @return mossa effettuta
     */
    String makeNewMove();

    /**
     * Fa partire una nuova gara
     */
    void startGame() throws FileNotFoundException;


}
