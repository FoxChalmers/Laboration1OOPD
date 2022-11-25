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

        setStationaryState();

        if (getIsStationary()) {
            platform.raisePlatform();
        }
        else {
            throw new IllegalStateException();
        }

    }

    public void lowerPlatform() {

        setStationaryState();

        if (getIsStationary()) {
            platform.lowerPlatform();
        }
        else {
            throw new IllegalStateException();
        }
    }

    public boolean isRaised() {
        return platform.isRaised();
    }

    @Override
    public void gas(double amount) {

        if (platform.isRaised()) {
            gas(1);
            setStationaryState();
        }
        else {
            throw new IllegalStateException();
        }
        
    }

}
