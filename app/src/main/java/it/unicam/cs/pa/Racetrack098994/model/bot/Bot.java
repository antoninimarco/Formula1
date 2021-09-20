package it.unicam.cs.pa.Racetrack098994.model.bot;

import it.unicam.cs.pa.Racetrack098994.model.car.Car;
import it.unicam.cs.pa.Racetrack098994.model.engine.SystemMovement;
import it.unicam.cs.pa.Racetrack098994.model.vector.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bot implements IBot {

    private final String name;
    private final Car car;
    private BotStatus status;
    private int round;
    private final List<Vector> vectors;

    public Bot(String name, Car car) {
        if ((name == null) || (car == null)) {
            throw new NullPointerException("Nome o macchina null");
        }
        this.name = name;
        this.car = car;
        status = BotStatus.RACE;
        round = 0;
        vectors = new ArrayList<>();
        vectors.add(car.getFirstVector());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bot bot = (Bot) o;
        return Objects.equals(name, bot.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Car getCar() {
        return car;
    }

    @Override
    public BotStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(BotStatus status) {
        this.status = status;
    }

    @Override
    public int getRound() {
        return round;
    }

    @Override
    public void incrementRound() {
        this.round++;
    }

    @Override
    public void move() {
        Vector newVector = SystemMovement.newVector(getLastVector());
        vectors.add(newVector);
        car.setVelocity(newVector.getLength());
        incrementRound();
    }

    @Override
    public List<Vector> getVectors() {
        return vectors;
    }

    @Override
    public Vector getLastVector() {
        return vectors.get(vectors.size() - 1);
    }

    @Override
    public String toString() {
        return "\nBot:" +
                "\tname=" + name +
                "\tcar=" + car +
                "\tstatus=" + status +
                "\tround=" + round;
    }
}
