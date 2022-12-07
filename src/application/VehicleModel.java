package application;

import java.util.ArrayList;
import javax.swing.Timer;

import cars.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class VehicleModel implements Observable {

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

                // Call observers
                updateObservers();

            }
        }
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void updateObservers() {
        for (Observer o: observers) {
            o.updateState();
        }
    }

    // Controller Methods



    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

}

