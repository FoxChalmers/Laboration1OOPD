package cars;

import java.awt.*;

public class TrimCar extends Car {
    
    private final static double trimFactor = 1.25;
    
    TrimCar(int nrDoors, double enginePower, Color color, String modelName) {

        super(nrDoors, enginePower, color, modelName);
        
    }    

    public double speedFactor() {
        return getEnginePower() * 0.01 * trimFactor;
    }


}
