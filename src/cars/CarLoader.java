package cars;
import java.util.*;

public class CarLoader {

    // Attributes
    private Stack<Car> carLoad = new Stack<Car>();     // Stack used to store loaded cars.
    private int maxLoad;                               // Max amount of cars allowed on the CarLoader.
    private HasCarLoader object;                       // Object that has the CarLoader.

    // Constructor
    CarLoader(int maxLoad, HasCarLoader object) {

        if (maxLoad > 0) {
            this.maxLoad = maxLoad;
            this.object = object;
        }
        else {
            throw new IllegalStateException("CarLoader maxLoad must take a value above 0.");
        }
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    // Calculates distance between car and vehicle.
    private double calculateDistanceToCar(Car car) {
        double distance = Math.hypot(object.getX() - car.getX(), object.getY() - car.getY());
        return distance;
    }


    // Loads car into CarLoader.
    public void loadCar(Car car) {

        if (carLoad.size() < maxLoad && calculateDistanceToCar(car) < 20) {
            carLoad.push(car);
        }
        else {
            throw new IllegalStateException("Could not load car. Requirements not fullfilled.");
        }

    }


    // Unloads the outer most car from CarLoader.
    public void unloadCar() {
        if (carLoad.size() != 0) {
            Car car = carLoad.pop();


            // Sets position of car same as vehicle holding the carloader. but x += 20.
            car.setX(object.getX() + 20);
            car.setY(object.getY()); 
        }
        else {
            throw new IllegalStateException("Cannot unload empty CarLoader");
        }
        
    }

}
