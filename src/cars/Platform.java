package cars;

public class Platform {
    
    private int tiltAngle;
    private int tiltAngleLimit;
    private boolean isRaised;


    // Constructor
    Platform() {
        this.tiltAngle = 0;
        this.isRaised = false;
        this.tiltAngleLimit = 70;
    }

    ////// Methods //////

    public void raisePlatform() {
        int newAngle = Math.min(tiltAngleLimit, tiltAngle + 1);
        tiltAngle = newAngle;
    }

    public void lowerPlatform() {
        int newAngle = Math.max(0, tiltAngle - 1);
        tiltAngle = newAngle;
    }

    public boolean setStationaryState(double currentSpeed ) {
        if (currentSpeed == 0) {
            return true;
        }
        else {
            return false;
        }
    }



    ////// GETTERS AND SETTERS ///////

    public boolean isRaised() {
        return isRaised;
    }
    



}
