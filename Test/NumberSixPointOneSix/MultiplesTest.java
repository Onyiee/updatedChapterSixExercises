package NumberSixPointOneSix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testToCheckForMultiples(){
        Multiples.isMultiples(2,4);
        assertTrue(Multiples.isMultiples(2,6));
    }
}