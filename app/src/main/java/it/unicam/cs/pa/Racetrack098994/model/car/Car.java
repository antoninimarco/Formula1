package it.unicam.cs.pa.Racetrack098994.model.car;

import it.unicam.cs.pa.Racetrack098994.model.vector.Vector;

public class Car implements ICar {
    private final Vector firstVector;
    private final Color color;
    private double velocity;

    public Car(Vector firstVector, Color color) {
        if (firstVector == null)
            throw new NullPointerException("Il vettore non deve essere nullo");
        if (color == null)
            throw new NullPointerException("Il vettore non deve avere colore nullo");
        this.firstVector = firstVector;
        this.color = color;
        this.velocity = firstVector.getLength();
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Vector getFirstVector() {
        return firstVector;
    }

    @Override
    public double getVelocity() {
        return velocity;
    }

    @Override
    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", velocity=" + velocity +
                '}';
    }
}