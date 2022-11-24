package cars;
import java.math.*;

public class Platform {
    
    private int tiltAngle;
    private int tiltAngleLimit;
    private boolean isRaised;


    Platform() {
        this.tiltAngle = 0;
        this.isRaised = false;
        this.tiltAngleLimit = 70;
    }

    public void raisePlatform() {
        int newAngle = Math.min(tiltAngleLimit, getTiltAngle() + 1);
        setTiltAngle(newAngle);
    }

    public void lowerPlatform() {
        int newAngle = Math.max(0, getTiltAngle() - 1);
        setTiltAngle(newAngle);
    }

    public int getTiltAngle() {
        return tiltAngle;
    }

    public void setTiltAngle(int tiltAngle) {
        this.tiltAngle = tiltAngle;
    }

    public boolean isRaised() {
        return isRaised;
    }

    public void setRaised(boolean isRaised) {
        this.isRaised = isRaised;
    }

    



}
