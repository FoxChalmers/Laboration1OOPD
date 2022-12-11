package application;

import java.util.ArrayList;

import cars.Vehicle;

public interface IVehicleModel extends Observable {

    public void start();
    public void addVehicle(Vehicle vehicle);
    public ArrayList<Vehicle> getVehicles();

}
