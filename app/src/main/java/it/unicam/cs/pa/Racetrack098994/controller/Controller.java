package it.unicam.cs.pa.Racetrack098994.controller;

import it.unicam.cs.pa.Racetrack098994.model.Game;
import it.unicam.cs.pa.Racetrack098994.model.loader.LoaderFile;
import it.unicam.cs.pa.Racetrack098994.model.bot.BotStatus;
import it.unicam.cs.pa.Racetrack098994.model.engine.RuleChecker;

import java.io.FileNotFoundException;


public class Controller implements IController {
    private Game game;
    private final String path;

    public Controller(String path) throws FileNotFoundException {
        if (path == null)
            throw new NullPointerException("Il file del path non puo essere nullo");
        this.path = path;
        startGame();
    }

    @Override
    public Game getGame() {
        return game;
    }

    @Override
    public String getStatus() {
        return game.getStatus();
    }

    @Override
    public String makeNewMove() {
        while (!game.isFinish()) {
            for (int i = 0; i < game.getBots().size(); i++) {
                if (game.getBots().get(i).getRound() < game.getRound() && game.getBots().get(i).getStatus() == BotStatus.RACE) {
                    game.getBots().get(i).move();
                    return RuleChecker.notifyPlayerMovementToString(game, game.getBots().get(i));
                }
            }
            if (game.isAtLeastOnePlayerInGame())
                game.incrementRound();
            else {
                game.finishGame();
            }
        }
        return "\nIl gioco e concluso\n";
    }

    @Override
    public void startGame() throws FileNotFoundException {
        game = LoaderFile.createGameFromPath(path);
    }
}

