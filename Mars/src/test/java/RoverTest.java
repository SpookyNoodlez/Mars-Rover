import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {
    private Rover rover;

    @BeforeEach
    void setUp(){
         rover = new Rover(0, 3,4);
    }

    @Test
    void testConstructor() {
        rover = new Rover(rover.E, 1,0);
        assertEquals(rover.E, rover.getFacing());
        assertEquals(1, rover.getX());
        assertEquals(0, rover.getY());
    }
    @Test
    void testMovingForward(){
        rover.move("f");
        assertEquals(5, rover.getY());
    }
    @Test
    void testMovingBackwards(){
        rover.move("b");
        assertEquals(3, rover.getY());
    }
    @Test
    void testMovingBackwardsTwice(){
        rover.move("bb");
        assertEquals(2, rover.getY());
    }
    @Test
    void testWrapTop(){
        rover.move("ff");
        assertEquals(1, rover.getY());
    }
}