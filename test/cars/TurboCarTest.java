package cars;

import static org.junit.Assert.*;
import org.junit.Test;

public class TurboCarTest {

    @Test
    public void gas_should_increase_speed_correctly() {
      Saab95 saab = new Saab95(0,0);

      double oldSpeed = saab.getCurrentSpeed();
      saab.startEngine();
      saab.gas(1);
      double newSpeed = saab.getCurrentSpeed();
      saab.gas(1);
  
      assertEquals(2, newSpeed - oldSpeed, 0.1);

    }
    
    @Test
    public void test_if_turbo_on_gives_correct_speedfactor() {
      Saab95 saab95 = new Saab95(0,0);
      saab95.setTurboOn();
      assertEquals(saab95.getEnginePower()* 0.01 * 1.3, saab95.speedFactor(), 0.1);
    }
  
    @Test
    public void test_if_turbo_off_gives_correct_speedfactor() {
      Saab95 saab95 = new Saab95(0,0);
      saab95.setTurboOn();
      saab95.setTurboOff();
      assertEquals(saab95.getEnginePower() * 0.01, saab95.speedFactor(), 0.1);
      
    }

}
