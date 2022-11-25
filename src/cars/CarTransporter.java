

public class CarTransporter extends Truck{

    private Platform platform;
    privat boolean isLoaded;

    CarTransporter(int nrDoors, double enginePower, Color color, String modelName, boolean isLoaded){
        this.platform = new Platform();
        this.isLoaded = isLoaded;
        super(nrDoors, enginePower, color, modelName);
        

    public double speedFactor() {
        return getEnginePower() * 0.005;
    }
    }
}