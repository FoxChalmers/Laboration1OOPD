package cars;
import java.awt.*;

public class Volvo240 extends Car {
    
    private TrimEngine engine;

    // Constructor
    public Volvo240() {
        super(4, 100.0, Color.black, "Volvo240");
        TrimEngine engine = new TrimEngine(getEnginePower());
    }

    public double speedFactor() {
        return engine.speedFactor();
    }

}
