package cars;

public class TrimEngine implements Engine {
    
    private final static double trimFactor = 1.25;
    private double enginePower;
    
    TrimEngine(double enginePower) {
        this.enginePower = enginePower;
    }    

    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }


}
