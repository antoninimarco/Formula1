package it.unicam.cs.pa.Racetrack098994.model;

import it.unicam.cs.pa.Racetrack098994.model.bot.Bot;
import it.unicam.cs.pa.Racetrack098994.model.bot.BotStatus;
import it.unicam.cs.pa.Racetrack098994.model.engine.CheckStartConfiguration;
import it.unicam.cs.pa.Racetrack098994.model.track.Track;

import java.util.List;

public class Game implements IGame {

    private final Track track;
    private final List<Bot> bots;
    private boolean gameFinish;
    private int round;

    public Game(Track track, List<Bot> bots) {
        if (track == null)
            throw new NullPointerException("Track non deve essere nullo");
        if (bots == null)
            throw new NullPointerException("Bots nulli");
        this.track = track;
        this.bots = bots;
        gameFinish = false;
        round = 0;
        CheckStartConfiguration.checkStartConfiguration(this);
    }

    @Override
    public Track getTrack() {
        return track;
    }

    @Override
    public List<Bot> getBots() {
        return bots;
    }

    @Override
    public String getStatus() {
        return "Game status:\n\tfinished: " + isFinish() + "\tround : " + round + "\nScore board: " + bots.toString();
    }

    @Override
    public boolean isFinish() {
        return gameFinish;
    }

    @Override
    public void finishGame() {
        gameFinish = true;
    }

    @Override
    public int getRound() {
        return round;
    }

    @Override
    public void incrementRound() {
        round++;
    }

    @Override
    public boolean isAtLeastOnePlayerInGame() {
        for (int i = 0; i < bots.size(); i++) {
            if (bots.get(i).getStatus() == BotStatus.RACE)
                return true;
        }
        return false;
    }

}
