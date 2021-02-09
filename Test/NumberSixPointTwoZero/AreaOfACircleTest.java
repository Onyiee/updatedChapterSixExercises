package NumberSixPointTwoZero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaOfACircleTest {
    AreaOfACircle areaOfACircle;

    @BeforeEach
    void setUp() {
        areaOfACircle = new AreaOfACircle();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatMethodAcceptsPi(){
        areaOfACircle.setPi(3.142);
        assertEquals(areaOfACircle.getPi(),3.142);
    }

    @Test
    void testThatMethodAcceptsRadius(){
        areaOfACircle.setRadius(7);
        assertEquals(7,areaOfACircle.getRadius());
    }

    @Test
    void testToCalculateAreaOfACircle(){
        assertEquals(153.958,areaOfACircle.circleArea(3.142,7));
    }
}