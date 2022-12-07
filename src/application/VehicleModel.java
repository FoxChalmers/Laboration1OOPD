package application;

import java.util.ArrayList;
import javax.swing.Timer;

import cars.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class VehicleModel {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private final int delay = 50;
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    private Timer timer = new Timer(delay, new TimerListener());

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void start() {

        timer.start();

    }

    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle vehicle : vehicles) {

                // Move cars
                vehicle.move();

                // Render cars
                updateObservers();

            }
        }
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void updateObservers() {
        for (Observer o: observers) {
            o.updateState();
        }
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

        public ArrayList<Vehicle> getVehicles() {
            return vehicles;
        }

}

