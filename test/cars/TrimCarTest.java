package cars;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrimCarTest {
    
    @Test
    public void gas_should_increase_speed_correctly() {

      Volvo240 volvo = new Volvo240(0,0);

      double oldSpeed = volvo.getCurrentSpeed();
      volvo.startEngine();
      volvo.gas(1);
      double newSpeed = volvo.getCurrentSpeed();
      volvo.gas(1);
  
      assertEquals(1.875, newSpeed - oldSpeed, 0);

    }

}
