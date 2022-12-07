package cars;
import application.*;

public class VehicleModelFactory {

    public static VehicleModel makeDefaultMode() {
        VehicleModel model = new VehicleModel();
        model.addVehicle(VehicleFactory.createVolvo(0,0));
        model.addVehicle(VehicleFactory.createSaab(100, 0));
        model.addVehicle(VehicleFactory.createScania(200, 0));
        return model;
    }
    
    
}
