package NumberSixPointOneNine;
//6.19 (Displaying a Square of Any Character) Modify the method created in Exercise 6.18
// to receive a second parameter of type char called fillCharacter. Form the square using
// the char provided as an argument. Thus, if side is 5 and fillCharacter is #, the method
// should display
//        #####
//        #####
//        #####
//        #####
//        #####
//        Use the following statement (in which input is a Scanner object) to read a
//        character from the user
//        at the keyboard:
//        char fill = input.next().charAt(0);

public class DisplayingTheSquareOfAnyCharacter {
    private int side;
    private char fillCharacter;

    public void setNumberOfTimesToDisplayCharacter(int side) {
        this.side = side;
    }

    public int getNumberOfTimesToDisplayCharacter() {
        return side;
    }

    public void setCharacterToDisplay(char character) {
        fillCharacter = character;
    }

    public char getCharacterToDisplay() {
        return fillCharacter;
    }

    public void SquareOfCharacter() {
        for (int row = 1; row <= side; row++){
            for (int column = 1; column <= side; column++){
                System.out.print(fillCharacter);
            }
            System.out.println();
        }
    }
}
