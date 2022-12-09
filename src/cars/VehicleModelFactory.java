package cars;
import application.*;

public class VehicleModelFactory {

    // This class is used to create a model that can be used to run the program.

    public static VehicleModel makeDefaultMode() {
        VehicleModel model = new VehicleModel();

        // Vehicles to include in model.
        model.addVehicle(VehicleFactory.createVolvo(0,0));
        model.addVehicle(VehicleFactory.createSaab95(100, 0));
        model.addVehicle(VehicleFactory.createScania(200, 0));
        return model;
    }
    
    
}
