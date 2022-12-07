package application;

import cars.Vehicle;

import java.util.ArrayList;

/*
* This class represents the Controller part in the MVC pattern.
* It's responsibilities is to listen to the View and responds in a appropriate manner by
* modifying the model state and the updating the view.
 */

public class VehicleController implements Observer {

    // The frame that represents this instance View of the MVC pattern
    VehicleView frame;

    // The model representing the state of the vehicles
    VehicleModel model;

    // list of vehicles.
    ArrayList<Vehicle> vehicles;

    public VehicleController(VehicleView view, VehicleModel model) {
        this.frame = view;
        this.model = model;
        this.vehicles = model.getVehicles();
        model.addObserver(this);
    }

    public void updateState() {
        frame.drawPanel.renderNextFrame(vehicles);
    }
    

}
