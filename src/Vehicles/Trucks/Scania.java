package cars;

import java.awt.Color;

public class Scania extends Vehicle {

    private Platform platform;

    public Scania() {
        super(2, 200, Color.RED, "Scania");
        this.platform = new Platform();
    }

    // Platform methods

    public void raisePlatform() {

        if (isStationary()) {
            platform.raisePlatform();
        } else {
            throw new IllegalStateException();
        }

    }

    public void lowerPlatform() {

        if (isStationary()) {
            platform.lowerPlatform();
        } else {
            throw new IllegalStateException();
        }

    }

    public boolean isRaised() {
        return platform.isRaised();
    }

    public int getTiltAngleLimit() {
        return platform.getTiltAngleLimit();
    }

    public int getTiltAngle() {
        return platform.getTiltAngle();
    }

    public double speedFactor() {
        return getEnginePower() * 0.01;
    }

    // Overrides gas from superclass (Truck) and checks that platform is not raised
    // otherwise throws exception.
    @Override
    public void gas(double amount) {

        if (platform.isRaised()) {
            throw new IllegalStateException();
        } else {
            super.gas(amount);
        }

    }

}
