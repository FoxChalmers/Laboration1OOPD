package application;


import cars.VehicleModelFactory;

public class Application {

    private static final int X = 800;
    private static final int Y = 800;

    public static void main(String[] args) {


        // Create model, controller and view.
        IVehicleModel vehicleModel = VehicleModelFactory.makeDefaultMode();
        IVehicleController vehicleController = new VehicleController(vehicleModel);
        IVehicleView vehicleView = new VehicleView(vehicleModel, vehicleController);

        // Start program
        vehicleModel.start();

    }


}
