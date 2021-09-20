package it.unicam.cs.pa.Racetrack098994.model.engine;

import it.unicam.cs.pa.Racetrack098994.model.Game;
import it.unicam.cs.pa.Racetrack098994.model.bot.Bot;
import it.unicam.cs.pa.Racetrack098994.model.bot.BotStatus;
import it.unicam.cs.pa.Racetrack098994.model.points.PointType;
import it.unicam.cs.pa.Racetrack098994.model.track.Track;


import java.util.List;

/**
 * gestisce le informazioni da stampare riferite al movimento e allo stato di ogni bot nel caso in cui: un bot abbiamo finito
 * il circuito, sia uscito dal circuito o se e andato a sbattere.
 */
public class RuleChecker {
    public static String notifyPlayerMovementToString(Game game, Bot bot) {
        String info = notifyBotMovement(bot);
        if (checkIfBotHasFinished(game.getTrack(), bot) != null)
            return info + checkIfBotHasFinished(game.getTrack(), bot);
        if (checkIfBotGoesOffRoad(game.getTrack(), bot) != null)
            return info + checkIfBotGoesOffRoad(game.getTrack(), bot);
        if (checkIfBotsCrashed(game.getBots()) != null)
            return info + checkIfBotsCrashed(game.getBots());
        return info + " e continua la gara. ";
    }

    /**
     * Metodo per gestire la stringa da stampare rispetto alle informazioni sul movimento di ogni giocatore
     *
     * @param bot giocatore
     * @return stringa descrittiva con nome, colore, vettore start e vettore finish del giocatore
     */
    private static String notifyBotMovement(Bot bot) {
        return "Il Bot " + bot.getName() + " di colore " + bot.getCar().getColor() + " ha effettuato uno spostamento da "
                + bot.getLastVector().getStart().toString() + " a " + bot.getLastVector().getFinish();
    }

    /**
     * Controllo se un giocatore ha concluso il circuito
     *
     * @param track circuito
     * @param bot   giocatore
     * @return stringa di fine circuito
     */
    private static String checkIfBotHasFinished(Track track, Bot bot) {
        if (track.getPointType(bot.getLastVector().getFinish()) == PointType.FINISH) {
            bot.setStatus(BotStatus.WIN);
            return " e ha finito il circuito ";
        }
        return null;
    }


    /**
     * Controllo se un giocatore è uscito dal circuito
     *
     * @param track circuito
     * @param bot   giocatore
     * @return stringa che indica che il giocatore e finito fuori strada
     */
    private static String checkIfBotGoesOffRoad(Track track, Bot bot) {
        if (track.getPointType(bot.getLastVector().getFinish()) == PointType.OUTROAD) {
            bot.setStatus(BotStatus.OUTROAD);
            return " e e' finito fuori strada ";
        }
        return null;
    }

    /**
     * Controllo se un giocatore e andato a sbattere con un altro giocatore
     *
     * @param bots giocatori
     * @return stringa che informa quali delle due macchine sono andati a sbattere
     */
    private static String checkIfBotsCrashed(List<Bot> bots) {
        for (int i = 0; i < bots.size(); i++) {
            for (int j = 0; j < bots.size(); j++) {
                if (!bots.get(i).equals(bots.get(j))) {
                    if (bots.get(i).getLastVector().getFinish().equals(bots.get(j).getLastVector().getFinish())) {
                        bots.get(i).setStatus(BotStatus.CRUSHED);
                        bots.get(j).setStatus(BotStatus.CRUSHED);
                        return " il giocatore " + bots.get(i).getName() + " e andato a sbattere con " + bots.get(j).getName();
                    }
                }
            }
        }

        return null;
    }


}
