package NumberSixPointOneNine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayingTheSquareOfAnyCharacterTest {
    DisplayingTheSquareOfAnyCharacter displayingTheSquareOfAnyCharacter;

    @BeforeEach
    void setUp() {
        displayingTheSquareOfAnyCharacter = new DisplayingTheSquareOfAnyCharacter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testForNumberOfTimesToDisplayCharacter(){
        displayingTheSquareOfAnyCharacter.setNumberOfTimesToDisplayCharacter(3);
        assertEquals(displayingTheSquareOfAnyCharacter.getNumberOfTimesToDisplayCharacter(),3);
    }

    @Test
    void testForCharacterToDisplay(){
        displayingTheSquareOfAnyCharacter.setCharacterToDisplay('$');
        assertEquals(displayingTheSquareOfAnyCharacter.getCharacterToDisplay(),'$');
    }

    @Test
    void testForDisplayOfCharacter(){
        displayingTheSquareOfAnyCharacter.setNumberOfTimesToDisplayCharacter(3);
        displayingTheSquareOfAnyCharacter.setNumberOfTimesToDisplayCharacter('$');
        displayingTheSquareOfAnyCharacter.SquareOfCharacter();
    }
}