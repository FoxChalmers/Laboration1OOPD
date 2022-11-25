package cars;
import java.awt.*;
import java.lang.reflect.GenericSignatureFormatError;

public class Scania extends Truck implements HasPlatform {
    
    private Platform platform;

    public Scania() {
        super(2, 200, Color.RED, "Scania");
        this.platform = new Platform();
    }


    // Platform methods

    public void raisePlatform() {
        platform.raisePlatform();
    }

    public void lowerPlatform() {
        platform.lowerPlatform();
    }

    public boolean isRaised() {
        return platform.isRaised();
    }

}
