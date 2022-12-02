package cars;

public class TurboEngine implements Engine {
    
    private boolean turboOn;
    private double enginePower;

    TurboEngine(double enginePower) {
        this.enginePower = enginePower; 
        this.turboOn = false;
    }

    // Methods
    public void setTurboOn() {
        turboOn = true;
    }

    public void setTurboOff() {
        turboOn = false;
    }    

    protected double speedFactor() {
        double turbo = 1;
        if (turboOn)
            turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

}
