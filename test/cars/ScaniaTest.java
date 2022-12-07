package cars;

import static org.junit.Assert.*;
import org.junit.Test;


public class ScaniaTest {
    
    @Test
    public void vehicle_cannot_gas_if_platform_is_raised() {

        Scania scania = new Scania(0,0);
        scania.raisePlatform();
        assertThrows(IllegalStateException.class, () -> scania.gas(1));

    }

}
