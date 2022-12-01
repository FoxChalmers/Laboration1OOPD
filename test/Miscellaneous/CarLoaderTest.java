package cars;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class CarLoaderTest {
 
    @Test
    public void carloader_cannot_unload_empty_carloader() {
        CarTransporter carTransporter = new CarTransporter();
        assertThrows(IllegalStateException.class, () -> carTransporter.unloadCar());
    }

    @Test
    public void carloader_cannot_load_full_carloader() {
        CarTransporter carTransporter = new CarTransporter();

        for (int i = 0; i < carTransporter.getMaxLoad(); i++) {
            carTransporter.loadCar(new Volvo240());
        }
        assertThrows(IllegalStateException.class, () -> carTransporter.loadCar(new Volvo240()));
    }

    @Test
    public void carloader_will_not_load_car_with_distance_over_20() {
        CarTransporter carTransporter = new CarTransporter();
        Volvo240 volvo = new Volvo240();
        volvo.setX(21);
        assertThrows(IllegalStateException.class, () -> carTransporter.loadCar(volvo));
    }

    @Test
    public void cannot_create_carloader_with_negative_cars() {
        assertThrows(IllegalStateException.class, () -> new CarRepairShop(-1, 0, 0));
    }

}
