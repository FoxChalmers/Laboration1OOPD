package application;
import javax.swing.*;



public class VehicleView implements IVehicleView {

    private static final int X = 800;
    private static final int Y = 800;

    // The controller member
    IVehicleModel vehicleModel;
    IVehicleController vehicleController;

    DrawPanel drawPanel;



    // Constructor
    public VehicleView(IVehicleModel model, IVehicleController vc) {
        
        this.vehicleModel = model;
        this.drawPanel = vc.getDrawPanel();

        // Makes vehicleView an observer of model.
        model.addObserver(this);

    }



    public void updateState() {
        drawPanel.renderNextFrame(vehicleModel.getVehicles());
    }

   
}
