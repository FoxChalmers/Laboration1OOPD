package application;

import java.util.ArrayList;

import cars.*;

public class VehicleModel {

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    
    public VehicleModel() {

    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void update() {

    }

    public void start() {
        
    }

    // Controller Methods

        // Calls the gas method for each car once
        void gas(int amount) {
            double gas = ((double) amount) / 100;
            for (Vehicle vehicle : vehicles) {
                vehicle.gas(gas);
            }
        }
    
        // Calls brake for each car once.
        void brake(int amount) {
            double brake = ((double) amount) / 100;
            for( Vehicle vehicle: vehicles) {
                vehicle.brake(brake);
            }
        }
        
        // Calls startEngine for each car once.
        void startEngine() {
            for (Vehicle vehicle: vehicles) {
                vehicle.startEngine();
            }
        }
    
        // Calls stopEngine for each car once.
        void stopEngine() {
            for (Vehicle vehicle: vehicles) {
                vehicle.stopEngine();
            }
        }
    
        // Raises platform for all scanias once.
        void liftPlatform() {
            for (Vehicle vehicle: vehicles) {
                if (vehicle instanceof Scania) {
                    Scania scania = (Scania) vehicle;
                    scania.raisePlatform();
                }
            }
        }
    
        void lowerPlatform() {
            for (Vehicle vehicle: vehicles) {
                if (vehicle instanceof Scania) {
                    Scania scania = (Scania) vehicle;
                    scania.lowerPlatform();
                }
            }
        }
    
        void TurboOn() {
            for (Vehicle vehicle: vehicles) {
                if (vehicle instanceof Saab95) {
                    Saab95 saab95 = (Saab95) vehicle;
                    saab95.setTurboOn();
                }
            }
        }
    
        void TurboOff() {
            for (Vehicle vehicle: vehicles) {
                if (vehicle instanceof Saab95) {
                    Saab95 saab95 = (Saab95) vehicle;
                    saab95.setTurboOff();
                }
            }
        }

}

