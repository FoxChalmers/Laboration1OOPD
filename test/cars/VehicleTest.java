package cars;
import java.awt.*;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;

public class VehicleTest {
    
    @Test
    public void gas_should_only_accept_value_between_one_and_zero() {

        Volvo240 volvo = new Volvo240(0,0);
        assertThrows(IllegalArgumentException.class, () -> volvo.gas(-0.0001));
        assertThrows(IllegalArgumentException.class, () -> volvo.gas(1.0001));

    }

    @Test
    public void brake_should_only_accept_value_between_one_and_zero() {

        Volvo240 volvo = new Volvo240(0,0);
        assertThrows(IllegalArgumentException.class, () -> volvo.brake(-0.1));
        assertThrows(IllegalArgumentException.class, () -> volvo.brake(1.1));

    }

    @Test
    public void gas_should_increase_speed_correctly() {

        Volvo240 volvo = new Volvo240(0,0);
        Point oldCoordinate = volvo.getCoordinate();
        volvo.startEngine();
        volvo.gas(1);
        volvo.move();
        Point newCoordinate = volvo.getCoordinate();
        assertNotEquals(oldCoordinate, newCoordinate);

    }


    @Test
    public void move_should_change_position_correctly() {

        Volvo240 volvo = new Volvo240(0,0);
        volvo.startEngine();
        volvo.gas(1);
        volvo.move();
        Point newCoordinate = volvo.getCoordinate();
        assertEquals(new Point(0,1), (newCoordinate));
    }

    @Test
    public void turn_left_should_turn_vehicle_correctly() {

        Volvo240 volvo = new Volvo240(0,0);
        volvo.turnLeft();
        assertEquals(new Point(-1,0), volvo.getDirection());

    }

    @Test
    public void turn_right_should_turn_vehicle_correctly() {

        Volvo240 volvo = new Volvo240(0,0);
        volvo.turnRight();
        assertEquals(new Point(1,0), volvo.getDirection());
    }

    @Test
    public void stop_engine_should_make_current_speed_zero() {
        
        Volvo240 volvo = new Volvo240(0,0);
        volvo.startEngine();
        volvo.gas(1);
        volvo.stopEngine();
        assertEquals(0, volvo.getCurrentSpeed(), 0);
        
    }

}
