package application;

import javax.swing.JFrame;

import cars.VehicleModelFactory;

public class Application {

    public static void main(String[] args) {



        // Create model, controller and view.
        IVehicleModel vehicleModel = VehicleModelFactory.makeDefaultMode();
        IVehicleController vehicleController = new VehicleController(vehicleModel);
        IVehicleView vehicleView = new VehicleView(vehicleModel, vehicleController);

        // Start program
        vehicleModel.start();

    }


}
