package cars;
import java.awt.Color;

public class Volvo240 extends Vehicle implements Car {


    // Constructor
    public Volvo240(int x, int y) {
        super(4, Color.black, "Volvo240", new TrimEngine(150), x, y);
    }

    public double speedFactor() {
        return getEngine().speedFactor();
    }

}
