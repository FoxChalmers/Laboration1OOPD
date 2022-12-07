package cars;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class CarTransporter extends Vehicle implements HasCarLoader {

    // Attributes
    private Platform platform;
    private CarLoader carLoader;
    private BufferedImage CarTransporterImage;

    // Constructor
    CarTransporter(int x, int y) {
        super(2, Color.BLUE, "Car Transport", new TrimEngine(100), x, y);
        this.platform = new Platform();
        this.carLoader = new CarLoader(8, this);
        try {
            this.CarTransporterImage = ImageIO.read(new File("src/application/pics/CarTransporter.jpeg"));
        }
        catch (IOException ex) {

        }


    }

    // Raises the ramp of CarTransport.
    public void raiseRamp() {
        platform.raiseToTop();
    }

    // Will lower the ramp if CarTransporter is stationary. Otherwise throw
    // exception.
    public void lowerRamp() {

        if (isStationary()) {
            platform.lowerToBottom();
        } else {
            throw new IllegalStateException();
        }

    }

    // Loads car if requirements are fullfilled. Otherwise prints in console.
    public void loadCar(Car car) {

        if (!platform.isRaised()) {
            carLoader.loadCar(car);
        } else {
            throw new IllegalStateException("Could not load car. Requirements not fullfilled.");
        }

    }

    // Unloads car from CarLoader.
    public void unloadCar() {

        if (!platform.isRaised()) {
            carLoader.unloadCar();
        } else {
            throw new IllegalStateException("Could not unload car. Requirements not fullfilled.");
        }
        
    }

    // Overrides gas from superclass (Truck) and checks that platform is raised
    // before calling to
    // gas from superclass.
    @Override
    public void gas(double amount) {

        if (platform.isRaised()) {
            super.gas(amount);
        } else {
            throw new IllegalStateException("Cannot gas when platform is down");
        }

    }

    public double speedFactor() {
        return getEnginePower() * 0.01;
    }

    public int getMaxLoad() {
        return carLoader.getMaxLoad();
    }

    @Override
    public void drawImage(Graphics g) {
        g.drawImage(CarTransporterImage, getX(), getY(), null);
    }

}
