package application;
import java.awt.*;
import javax.swing.*;
import cars.*;

// This panel represent the animated part of the view with the car images.

public class DrawPanel extends JPanel{

    CarController cc;
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
        Volvo240 volvo = new Volvo240(0, 0);
        volvo.drawImage(g);
        Scania scania = new Scania(200, 0);
        scania.drawImage(g);
        Saab95 saab = new Saab95(100, 0);
        saab.drawImage(g);

        /*for (Vehicle vehicle: cc.vehicles) {
            vehicle.drawImage(g);
        }*/
    }
}
