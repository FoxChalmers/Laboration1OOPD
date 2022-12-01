package cars;

import java.awt.Color;

public abstract class Truck extends Vehicle {
    
    Truck(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

    public double speedFactor() {
        return getEnginePower() * 0.005;
    }

}
