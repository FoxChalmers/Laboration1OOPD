package application;
import cars.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    ArrayList<Vehicle> vehicles;

    public void renderNextFrame(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
        this.repaint();
    }

    // Initializes the panel and reads the images
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.green);
    }

    // This method is called each time the panel updates/refreshes/repaints itself
    // TODO: Change to suit your needs.
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (Vehicle v: vehicles) {
            v.drawImage(g);
        }
        
    }
}
