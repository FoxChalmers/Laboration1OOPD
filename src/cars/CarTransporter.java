package cars;

import java.awt.Color;

public class CarTransporter extends Vehicle implements HasCarLoader {

    // Attributes
    private Platform platform;
    private CarLoader carLoader;

    // Constructor
    CarTransporter() {
        super(2, 200, Color.BLUE, "Car Transport");
        this.platform = new Platform();
        this.carLoader = new CarLoader(8, this);
    }

    // Raises the ramp of CarTransport.
    public void raiseRamp() {
        platform.setTiltAngle(platform.getTiltAngleLimit());
    }

    // Will lower the ramp if CarTransporter is stationary. Otherwise throw
    // exception.
    public void lowerRamp() {

        if (isStationary()) {
            platform.setTiltAngle(0);
        } else {
            throw new IllegalStateException();
        }

    }

    // Loads car if requirements are fullfilled. Otherwise prints in console.
    public void loadCar(Car car) {

        if (!platform.isRaised()) {
            carLoader.loadCar(car);
        } else {
            throw new IllegalStateException("Could not load car. Requirements not fullfilled.");
        }

    }

    // Unloads car from CarLoader.
    public void unloadCar() {

        if (!platform.isRaised()) {
            carLoader.unloadCar();
        } else {
            throw new IllegalStateException("Could not unload car. Requirements not fullfilled.");
        }
        
    }

    // Overrides gas from superclass (Truck) and checks that platform is raised
    // before calling to
    // gas from superclass.
    @Override
    public void gas(double amount) {

        if (platform.isRaised()) {
            super.gas(amount);
        } else {
            throw new IllegalStateException("Cannot gas when platform is down");
        }

    }

    public double speedFactor() {
        return getEnginePower() * 0.01;
    }

    public int getMaxLoad() {
        return carLoader.getMaxLoad();
    }

}
