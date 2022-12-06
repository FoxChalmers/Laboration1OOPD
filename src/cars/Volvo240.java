package cars;
import java.awt.Color;

public class Volvo240 extends Vehicle implements ACar {
    
    private TrimEngine engine;

    // Constructor
    public Volvo240() {
        super(4, 100.0, Color.black, "Volvo240");
        this.engine = new TrimEngine(getEnginePower());
    }

    public double speedFactor() {
        return engine.speedFactor();
    }

}
