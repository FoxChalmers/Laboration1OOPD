package cars;

import static org.junit.Assert.*;
import org.junit.Test;

public class PlatformVehicleTest {
    
    @Test
    public void vehicle_cannot_raise_platform_when_not_stationary() {

        Scania scania = new Scania(0,0);
        scania.startEngine();
        scania.gas(1);
        assertThrows(IllegalStateException.class, () -> scania.raisePlatform());

    }

    @Test
    public void vehicle_cannot_lower_platform_when_not_stationary() {

        Scania scania = new Scania(0,0);
        scania.startEngine();
        scania.gas(1);
        assertThrows(IllegalStateException.class, () -> scania.lowerPlatform());

    }

    @Test
    public void platform_angle_should_not_go_higher_than_tilt_angle_limit() {

        Scania scania = new Scania(0,0);

        for (int i = 0; i < scania.getTiltAngleLimit() + 1; i++) {
            scania.raisePlatform();
        }

        assertEquals(scania.getTiltAngleLimit(), scania.getTiltAngle());
    }

    @Test
    public void platform_angle_should_not_go_lower_than_zero() {

        Scania scania = new Scania(0,0);
        scania.lowerPlatform();
        assertEquals(0, scania.getTiltAngle());
    }

}
