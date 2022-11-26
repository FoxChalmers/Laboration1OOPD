package cars;
import java.awt.Color;
public class CarTransporter extends Truck {

    private Platform platform;
    private Car[] carLoad = new Car[8];
    private int loadedCars = 0;
    
    CarTransporter() {
        super(2, 200, Color.BLUE, "Car Transport");
        this.platform = new Platform();
    }

    public void raiseRamp() {
        platform.setTiltAngle(platform.getTiltAngleLimit());
    }

    public void lowerRamp() {
        platform.setTiltAngle(0);
    }

    public double calculateDistanceToCar(Car car) {
        double distance = Math.hypot(getX() - car.getX(), getY() - car.getY());
        return distance;
    }

    public void loadCar(Car car) {

        if (!platform.isRaised() && isStationary() && (calculateDistanceToCar(car) < 20)) {
            carLoad[loadedCars] = car;
            loadedCars++;
        }
        else {
            throw new IllegalStateException();
        }

    }

}
