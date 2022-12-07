package application;
import cars.*;

public class Application {
    
    public static void main(String[] args) {
        // Instance of this class
        CarModel carModel = new CarModel();
        CarView carView = new CarView();
        CarController carController = new CarController(carModel, carView);

    }

}
