package cars;
import java.awt.*;

public class Saab95 extends Car {

    private TurboEngine engine;

    // Constructor
    public Saab95() {
        super(2, 125.0, Color.red, "Saab95");
        this.engine = new TurboEngine(getEnginePower());
    }

    public double speedFactor() {
        return engine.speedFactor();
    }

    public void setTurboOn() {
        engine.setTurboOn();
    }

    public void setTurboOff() {
        engine.setTurboOff();
    }    

}
