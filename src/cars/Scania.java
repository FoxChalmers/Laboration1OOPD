package cars;
import java.awt.*;

public class Scania extends Truck {
    
    private Platform platform;

    public Scania() {
        super(2, 200, Color.RED, "Scania");
        this.platform = new Platform();
    }


    // Platform methods

    public void raisePlatform() {

        if (isStationary()) {
            platform.raisePlatform();
        }
        else {
            throw new IllegalStateException();
        }

    }

    public void lowerPlatform() {

        if (isStationary()) {
            platform.lowerPlatform();
        }
        else {
            throw new IllegalStateException();
        }

    }

    public boolean isRaised() {
        return platform.isRaised();
    }

    public int getTiltAngleLimit() {
        return platform.getTiltAngleLimit();
    }

    public int getTiltAngle() {
        return platform.getTiltAngle();
    }


    // FIX (Code duplication)
    
    @Override
    public void gas(double amount) {

        if (platform.isRaised()) {
            throw new IllegalStateException();
        }
        else {
            super.gas(amount);
        }
        
    }

}
