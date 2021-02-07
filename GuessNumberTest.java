package NumberSixPointThreeZero;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessNumberTest {
    GuessNumber guessNumber;
    int actualNumber;

    @BeforeEach
    void setUp() {
        guessNumber = new GuessNumber();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void compareRandomNumber() {
        assertEquals(0,guessNumber.compareRandomNumber(actualNumber));
        assertEquals(-1, guessNumber.compareRandomNumber(actualNumber-1));
        assertEquals(1, guessNumber.compareRandomNumber(actualNumber + 1));

    }

    @Test
    void resetRandomNumber() {
        guessNumber.resetRandomNumber();

    }
}