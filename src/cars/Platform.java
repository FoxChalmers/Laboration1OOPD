package cars;

public class Platform {
    
    private int tiltAngle;
    private int tiltAngleLimit;


    // Constructor
    Platform() {
        this.tiltAngle = 0;
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



    ////// GETTERS AND SETTERS ///////

    public boolean isRaised() {

        if (tiltAngle == 0) {
            return false;
        }
        else {
            return true;
        }

    }


    public int getTiltAngleLimit() {
        return tiltAngleLimit;
    }

    public int getTiltAngle() {
        return tiltAngle;
    }

    public void setTiltAngle(int tiltAngle) {
        this.tiltAngle = tiltAngle;
    }

    
    



}
