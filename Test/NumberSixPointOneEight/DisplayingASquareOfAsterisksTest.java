package NumberSixPointOneEight;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayingASquareOfAsterisksTest {
    DisplayingASquareOfAsterisks displayingASquareOfAsterisks;

    @BeforeEach
    void setUp() {
        displayingASquareOfAsterisks = new DisplayingASquareOfAsterisks();
    }

    @AfterEach
    void tearDown() {
    }

  @Test
  void testForNumberOfTimesACharacterDisplays(){
        displayingASquareOfAsterisks.setNumberOfAsterisks(5);
        assertEquals(displayingASquareOfAsterisks.getNumberOfAsterisks(),5);
  }

  @Test
  void testForCharacter(){
        displayingASquareOfAsterisks.setCharacter('*');
        assertEquals(displayingASquareOfAsterisks.getCharacter(),'*');

  }

  @Test
  void testThatCharacterCanBeDisplayedWithASpecifiedSize(){
        displayingASquareOfAsterisks.setNumberOfAsterisks(5);
        displayingASquareOfAsterisks.setCharacter('*');
        displayingASquareOfAsterisks.getSquareOfAsterisks();
  }
}