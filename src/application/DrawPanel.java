package application;

import cars.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel {

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    // Updates local vehicles to that of Model and renders next frame.
    public void renderNextFrame(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
        this.repaint();
    }

    // Initializes the panel
    public DrawPanel(int x, int y) {
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(x, y));
        this.setBackground(Color.gray);
    }

    // This method is called each time the panel updates/refreshes/repaints itself
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw images of all vehicles.
        for (Vehicle v : vehicles) {
            v.drawImage(g);
        }

    }

}
