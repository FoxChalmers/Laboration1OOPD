package application;

import java.util.ArrayList;

import cars.Vehicle;

public interface IVehicleModel extends Observable {

    public void start();
    public void addVehicle(Vehicle vehicle);
    public ArrayList<Vehicle> getVehicles();

    public void gas(int amount);
    public void brake(int amount);
    public void startEngine();
    public void stopEngine();
    public void liftPlatform();
    public void lowerPlatform();
    public void TurboOn();
    public void TurboOff();

}
