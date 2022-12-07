package cars;
import java.awt.Color;

public class Saab95 extends Vehicle implements Car {

    private TurboEngine engine;

    // Constructor
    public Saab95(int x, int y) {
        super(2, Color.red, "Saab95", new TurboEngine(200), x, y);
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
