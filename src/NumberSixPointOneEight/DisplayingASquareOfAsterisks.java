package NumberSixPointOneEight;
//6.18 (Displaying a Square of Asterisks) Write a method squareOfAsterisks that displays a solid
//        square (the same number of rows and columns) of asterisks whose side is specified in
//        integer parameter side. For example, if side is 4, the method should display
//        ****
//        ****
//        ****
//        ****
//        Incorporate this method into an application that reads an integer value for side
//        from the user and outputs the asterisks with the squareOfAsterisks method.

public class DisplayingASquareOfAsterisks {
    private int size;
    private char character='*';


    public void setNumberOfAsterisks(int size) {
        this.size =  size;
    }

    public int getNumberOfAsterisks() {
        return size;
    }

    public void setCharacter(char character) {
        character='*';
        this.character = character;
    }

    public char getCharacter() {
        return character;
    }

    public void getSquareOfAsterisks() {
        for (int row= 1; row <= size; row++){
            for (int column = 1; column <= size; column++){
                System.out.print(character);
            }
            System.out.println();
        }
    }
}
