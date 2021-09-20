package it.unicam.cs.pa.Racetrack098994.model.engine;

import it.unicam.cs.pa.Racetrack098994.model.Game;
import it.unicam.cs.pa.Racetrack098994.model.bot.Bot;
import it.unicam.cs.pa.Racetrack098994.model.points.TrackPoint;
import it.unicam.cs.pa.Racetrack098994.model.track.Track;

import java.util.List;

/**
 * Classe che controlla se la posizione iniziale dei bot e sulla linea dello start
 */
public class CheckStartConfiguration {

    /**
     * Controllo posizione di partenza dei giocatori che partecipano alla gara
     *
     * @param game gara
     */
    public static void checkStartConfiguration(Game game) {
        checkBotsStartPosition(game.getTrack(), game.getBots());

    }

    /**
     * Metodo utilizzato per controllare se i bot sono posizionati sulla linea dello start
     *
     * @param track circuito
     * @param bots  giocatori
     */
    private static void checkBotsStartPosition(Track track, List<Bot> bots) {
        for (int i = 0; i < bots.size(); i++) {
            boolean isCorrect = false;
            for (int j = 0; j < track.getStartLine().size(); j++) {
                if (new TrackPoint(bots.get(i).getLastVector().getStart()).equals(track.getStartLine().get(j))) {
                    isCorrect = true;

                }

            }
            if (!isCorrect) {
                throw new IllegalArgumentException(" Il bot " + bots.get(i).getName() + " non ha il vettore di partenza nel punto iniziale");
            }
        }

    }
}
