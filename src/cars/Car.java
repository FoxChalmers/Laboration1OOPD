package cars;

import java.awt.*;

public abstract class Car extends Vehicle implements Movable {

    Car(int nrDoors, double enginePower, Color color, String modelName) {
        super(nrDoors, enginePower, color, modelName);
    }

}