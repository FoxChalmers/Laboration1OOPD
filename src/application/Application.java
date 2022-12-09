package application;
import cars.VehicleModelFactory;

public class Application {
    
    public static void main(String[] args) {

        // Create model, controller and view.
        VehicleModel vehicleModel = VehicleModelFactory.makeDefaultMode();
        VehicleController vehicleController = new VehicleController(vehicleModel);
        VehicleView vehicleView = new VehicleView(vehicleModel, vehicleController);

        // Start program
        vehicleModel.start();

    }

}
