package application;
import javax.swing.*;
import java.awt.*;



public class VehicleView extends JFrame implements IVehicleView  {

    private static final int X = 800;
    private static final int Y = 800;

    // The controller member
    private IVehicleModel vehicleModel;

    private DrawPanel drawPanel = new DrawPanel(X, Y-240);
    private JPanel vehicleControllerInterface;



    // Constructor
    public VehicleView(IVehicleModel model, IVehicleController vehicleController) {
        this.vehicleModel = model;
        this.vehicleControllerInterface = vehicleController.getControllerInterface();

        initView();

        // Makes vehicleView an observer of model.
        model.addObserver((IVehicleView)this);

    }

    // Renders next frame
    public void updateState() {
        drawPanel.renderNextFrame(vehicleModel.getVehicles());
    }




    // Initializes the view.
    public void initView() {

        this.setTitle("vehiclesim 1.0");
        this.setPreferredSize(new Dimension(X, Y));
        this.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        // Adds drawpanel and controller interface to view.
        this.add(drawPanel);
        this.add(vehicleControllerInterface);


        // Make the frame pack all it's components by respecting the sizes if possible.
        this.pack();

        // Get the computer screen resolution
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // Center the frame
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        // Make the frame visible
        this.setVisible(true);
        // Make sure the frame exits when "x" is pressed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

   
}
