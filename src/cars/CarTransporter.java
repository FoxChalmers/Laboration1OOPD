
package cars;
import java.awt.*;


public class CarTransporter extends Truck{

    private Platform platform;
    private boolean isLoaded;
    private int storageLimitation = 10;

    CarTransporter(int nrDoors, double enginePower, Color color, String modelName, boolean isLoaded){
        super(nrDoors, enginePower, color, modelName);
        this.platform = new Platform();
        this.isLoaded = isLoaded;
        
    }

    public double speedFactor() {
        return getEnginePower() * 0.005;
    }


    // 
    public boolean loadON(Truck storageList){
        if(storageList != storageLimitation && isLoaded == false){
            return true;
        } else {
            return false;

        } 
    }
    }
