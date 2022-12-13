package application;

import java.util.ArrayList;
import javax.swing.Timer;

import cars.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class VehicleModel implements IVehicleModel {

    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private final int delay = 50;
    private ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    private Timer timer = new Timer(delay, new TimerListener());

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Starts the timer.
    public void start() {

        timer.start();

    }

    // Gets called each frame
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle vehicle : vehicles) {

                // Move cars
                vehicle.move();

                // Call observers
                updateObservers();


            }
        }
    }

    // Adds observer to observer list.
    public void addObserver(Observer o) {
        observers.add(o);
    }

    // Removes observer to observer list.
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // Calls updateState() on all observers.
    public void updateObservers() {
        for (Observer o: observers) {
            o.updateState();
        }
    }


    public ArrayList<Vehicle> getVehicles() {
        // Creates a copy of vehicles and returns it.
        ArrayList<Vehicle> newList = new ArrayList<Vehicle>(vehicles);
        return newList;
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

