package application;

public interface IVehicleController {
    
    public void gas(int amount);
    public void brake(int amount);
    public void startEngine();
    public void stopEngine();
    public void liftPlatform();
    public void lowerPlatform();
    public void TurboOn();
    public void TurboOff();

}
