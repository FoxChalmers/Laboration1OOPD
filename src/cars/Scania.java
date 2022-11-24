package cars;
import java.awt.*;

public class Scania extends Car {
    
    Platform platform;
    Boolean isStationary;

    public Scania() {
        super(2, 200, Color.RED, "Scania");
        this.platform = new Platform();
        this.isStationary = true;
    }

    // FIX (Should be implemented differently?)
    public double speedFactor() {
        return getEnginePower() * 0.01 ;
    }

    public void setStationaryState() {
        if (getCurrentSpeed() == 0) {
            isStationary = true;
        }
        else {
            isStationary = false;
        }
    }



    



}
