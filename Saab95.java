import java.awt.*;

public class Saab95 extends Car{
 
    public boolean turboOn;

    public Saab95(){
        setNrDoors(2);
        setColor(Color.red);
        setEnginePower(125);
        setModelName("Saab95");
        setDirectionIndex(0);
        turboOn = false;
        stopEngine();
        setX(0);
        setY(0);
    }


    public void setTurboOn(){
	    turboOn = true;
    }

    public void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return getEnginePower() * 0.01 * turbo;
    }

    public void incrementSpeed(double amount){
        if (getCurrentSpeed() + speedFactor() * amount > this.getEnginePower()){
            setCurrentSpeed(this.getEnginePower());
        }
        else{
            setCurrentSpeed(getCurrentSpeed() + speedFactor() * amount);  
        }
        
    }

    public void decrementSpeed(double amount){
        if (getCurrentSpeed() - speedFactor() * amount < 0){
            setCurrentSpeed(0);
        }
        else{
            setCurrentSpeed(getCurrentSpeed() - speedFactor() * amount);  
        }
    }
    
    // TODO fix this method according to lab pm
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

    // TODO This is howls gren
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
