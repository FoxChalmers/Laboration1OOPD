package cars;
import java.util.*;

public class CarLoader {

    // Attributes
    private Stack<Car> carLoad = new Stack<Car>();     // Stack used to store loaded cars.
    private int maxLoad;            // Max amount of cars allowed on the CarLoader.
    private int loadedCars = 0;     // Amount of cars currently loaded.
    private Vehicle vehicle;        // The vehicle on which the carloader is placed.

    // Constructor
    CarLoader(int maxLoad, Vehicle vehicle) {
        this.maxLoad = maxLoad;
        this.vehicle = vehicle;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    // Calculates distance between car and vehicle.
    private double calculateDistanceToCar(Car car) {
        double distance = Math.hypot(vehicle.getX() - car.getX(), vehicle.getY() - car.getY());
        return distance;
    }


    // Loads car into CarLoader.
    public void loadCar(Car car) {

        if (loadedCars < maxLoad && calculateDistanceToCar(car) < 20) {
            carLoad.push(car);
            loadedCars++;
        }
        else {
            throw new IllegalStateException("Could not load car. Requirements not fullfilled.");
        }

    }


    // Unloads the outer most car from CarLoader.
    public void unloadCar() {
        if (loadedCars != 0) {
            Car car = carLoad.pop();
            loadedCars--;

            // Sets position of car same as vehicle holding the carloader. but x += 20.
            car.setX(vehicle.getX() + 20);
            car.setY(vehicle.getY()); 
        }
        else {
            throw new IllegalStateException("Cannot unload empty CarLoader");
        }
        
    }

}
