package cars;

import static org.junit.Assert.*;
import org.junit.Test;
import java.awt.Color;

public class CarTransporterTest {
    
    @Test
    public void carTransporter_will_not_drive_if_ramp_is_down() {
        CarTransporter carTransporter = new CarTransporter();
        carTransporter.lowerRamp();
        assertThrows(IllegalStateException.class, () -> carTransporter.gas(1));
    }

    @Test
    public void carTransporter_will_not_load_car_if_ramp_is_up() {
        CarTransporter carTransporter = new CarTransporter();
        carTransporter.raiseRamp();
        assertThrows(IllegalStateException.class, () -> carTransporter.loadCar(new Volvo240()));
    }

}
