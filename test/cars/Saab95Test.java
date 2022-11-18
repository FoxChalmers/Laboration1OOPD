package cars;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class Saab95Test {
  

  @Test 
  public void see_if_speedfactor_is_correctly_calculated() {
    Saab95 testSaab = new Saab95();
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01);
  }
  
  @Test
  public void see_if_turbo_method_change_speedfactor_according_to_plans() {
    Saab95 testSaab = new Saab95();
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01);
  }
  public void see_if_turbo_is_on(){
    Saab95 testSaab = new Saab95();
    testSaab.setTurboOn();
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01*1.3);
  }

  @Test
    public void see_if_turbo_is_off(){
      Saab95 testSaab = new Saab95();
    testSaab.setTurboOff();
    assertTrue(testSaab.speedFactor() == testSaab.getEnginePower()*0.01);
    }
  }