package application;

import cars.*;

import java.util.ArrayList;

import javax.swing.JPanel;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class VehicleController extends JPanel implements IVehicleController {

    // The model representing the state of the vehicles
    IVehicleModel model;

    // list of vehicles.
    ArrayList<Vehicle> vehicles;

    public VehicleController(IVehicleModel model) {
        this.model = model;
        this.vehicles = model.getVehicles();
    }

    // Calls the gas method for each car once
    public void gas(int amount) {
        double gas = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles) {
            vehicle.gas(gas);
        }
    }

    // Calls brake for each car once.
    public void brake(int amount) {
        double brake = ((double) amount) / 100;
        for (Vehicle vehicle : vehicles) {
            vehicle.brake(brake);
        }
    }

    // Calls startEngine for each car once.
    public void startEngine() {
        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
        }
    }

    // Calls stopEngine for each car once.
    public void stopEngine() {
        for (Vehicle vehicle : vehicles) {
            vehicle.stopEngine();
        }
    }

    // Raises platform for all scanias once.
    public void liftPlatform() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Scania) {
                Scania scania = (Scania) vehicle;
                scania.raisePlatform();
            }
        }
    }

    public void lowerPlatform() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Scania) {
                Scania scania = (Scania) vehicle;
                scania.lowerPlatform();
            }
        }
    }

    public void TurboOn() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Saab95) {
                Saab95 saab95 = (Saab95) vehicle;
                saab95.setTurboOn();
            }
        }
    }

    public void TurboOff() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Saab95) {
                Saab95 saab95 = (Saab95) vehicle;
                saab95.setTurboOff();
            }
        }
    }

}
