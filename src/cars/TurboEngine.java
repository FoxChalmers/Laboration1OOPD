package cars;

public class TurboEngine implements Engine {
    
    private boolean turboOn;
    private double enginePower;
    private boolean isOn;

    TurboEngine(double enginePower) {
        this.enginePower = enginePower;
        this.turboOn = false;
        this.isOn = false;
    }

    // Methods
    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }    

    public double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    public void turnOnEngine() {
        this.isOn = true;
    }

    public void turnOffEngine() {
        this.isOn = false;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public boolean isOn() {
        return isOn;
    }

}
