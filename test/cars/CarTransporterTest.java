package cars;

import static org.junit.Assert.*;
import org.junit.Test;

public class CarTransporterTest {
    
    @Test
    public void carTransporter_will_not_drive_if_ramp_is_down() {
        CarTransporter carTransporter = new CarTransporter(0, 0);
        carTransporter.lowerRamp();
        assertThrows(IllegalStateException.class, () -> carTransporter.gas(1));
    }

    @Test
    public void carTransporter_will_not_load_car_if_ramp_is_up() {
        CarTransporter carTransporter = new CarTransporter(0, 0);
        carTransporter.raiseRamp();
        assertThrows(IllegalStateException.class, () -> carTransporter.loadCar(new Volvo240(0,0)));
    }

}
