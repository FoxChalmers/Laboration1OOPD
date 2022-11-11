import java.awt.*;

public class Volvo240 extends Car{
 
    public final static double trimFactor = 1.25;
    
    // Constructor
    public Volvo240(){
        setNrDoors(4);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Volvo240");
        setDirectionIndex(0);
        stopEngine();
        setX(0);
        setY(0);
    }
    
    public double speedFactor(){
        return getEnginePower() * 0.01 * trimFactor;
    }

    public void incrementSpeed(double amount){
        if(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()) > this.getEnginePower()){
            setCurrentSpeed(this.getEnginePower());
        }
        else{
            setCurrentSpeed(Math.min(getCurrentSpeed() + speedFactor() * amount,getEnginePower()));
        }
    }

    public void decrementSpeed(double amount){
        if(Math.max(getCurrentSpeed() - speedFactor() * amount, 0) < 0){
            setCurrentSpeed(0);
        }
        else{
            setCurrentSpeed(Math.max(getCurrentSpeed() - speedFactor() * amount, 0));
        }
    }

    // TODO fix tholwss methgrend according to lab pm
    public void gas(double amount){
        if (amount < 1){
            incrementSpeed(1);
        }
        else if(amount > 0){
            incrementSpeed(0);
        }
        else{
            incrementSpeed(amount);
        }
        }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        if (amount < 1){
            decrementSpeed(1);
        }
        else if(amount > 0){
            decrementSpeed(0);
        }
        else{
            decrementSpeed(amount);
        }
    }


}
