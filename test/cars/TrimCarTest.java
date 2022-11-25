package cars;
import java.awt.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class TrimCarTest {
    
    @Test
    public void gas_should_increase_speed_correctly() {
      Volvo240 volvo = new Volvo240();

      double oldSpeed = volvo.getCurrentSpeed();
      volvo.gas(1);
      double newSpeed = volvo.getCurrentSpeed();
      volvo.gas(1);

      assertEquals(1.25, newSpeed - oldSpeed, 0);

    }

}
