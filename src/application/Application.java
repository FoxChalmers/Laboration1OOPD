package application;
import cars.VehicleModelFactory;

public class Application {
    
    public static void main(String[] args) {


        VehicleModel vehicleModel = VehicleModelFactory.makeDefaultMode();
        VehicleView vehicleView = new VehicleView(vehicleModel);
        VehicleController vehicleController = new VehicleController(vehicleView, vehicleModel);

        vehicleModel.start();

    }

}
