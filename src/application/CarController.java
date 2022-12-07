package application;
import cars.*;
import javax.swing.*;

import cars.Vehicle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class CarController {
    // member fields:

    // The delay (ms) corresponds to 20 updates a sec (hz)
    private final int delay = 50;
    // The timer is started with an listener (see below) that executes the statements
    // each step between delays.
    public Timer timer = new Timer(delay, new TimerListener());

    // The frame that represents this instance View of the MVC pattern
    CarView frame;
    // A list of vehicles, modify if needed
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    //methods:


    /* Each step the TimerListener moves all the vehicles in the list and tells the
    * view to update its images. Change this method to your needs.
    * */
    private class TimerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (Vehicle vehicle : vehicles) {
                vehicle.move();
                // repaint() calls the paintComponent method of the panel
                frame.drawPanel.repaint();
            }
        }
    }

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
