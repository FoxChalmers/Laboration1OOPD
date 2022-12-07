package cars;

public class TrimEngine implements Engine {
    
    private final static double trimFactor = 1.25;
    private double enginePower;
    private boolean isOn;
    
    TrimEngine(double enginePower) {
        this.enginePower = enginePower;
        this.isOn = false;
    }    

    public double speedFactor() {
        return enginePower * 0.01 * trimFactor;
    }

    public void turnOnEngine() {
        this.isOn = true;
    }

    public void turnOffEngine() {
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getEnginePower() {
        return enginePower;
    }


}
