import java.util.Random;        
import java.util.Scanner;

public class GameBoard {
    /**Attributes**/
    private int[][] board = new int[3][3];      //3x3 2D array that will be the game board
    private int[] numbers = {1,2,3,4,5,6,7,8,9};        //Array that holds numbers to shuffle across the board
    
    

    /**Constructors**/
    public GameBoard() {
    }


    /**Methods**/
    //Randomly places numbers 1-9 across the 3x3 2D array 
    public void ShuffleBoard(){
        Random random = new Random();       //Create new random object

        //Shuffle the numbers array
        for (int i = numbers.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            // Swap numbers[i] and numbers[index]
            int temp = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = temp;
        }

        //Fill the 3x3 array with shuffled numbers
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = numbers[index++];
            }
        }    DisplayBoard();        //Call DisplayBoard to print the board
    }

    //Print the board to the screen
    public void DisplayBoard(){
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t"+ board[i][j]);
            }
            System.out.println();
        }   System.out.println();
    }

    //Swap two board locations by element value entered by the user
    public boolean SwapNumbers(){       //Returns a boolean value true if a swap occurs, will be used to count number of swaps
        Scanner scanner = new Scanner(System.in);       //New Scanner object to read user input

        //Prompt the user to enter the two numbers they want to swap locations with and store in value1 and value2 
        System.out.print("Enter a digit to move: ");
        int value1 = scanner.nextInt();
        System.out.print("Enter a digit to swap with: ");
        int value2 = scanner.nextInt();

        //Get the board position for each value
        int[] position1 = GetPosition(value1);      //Get position of value1
        int[] position2 = GetPosition(value2);      //Get position of value2

        //Swap the positions for each value
        int temp = board[position1[0]][position1[1]];       //Store value1 and location in temp variable

        board[position1[0]][position1[1]] = board[position2[0]][position2[1]];      //Store value2 where value1 was
        board[position2[0]][position2[1]] = temp;       //temp becomes new value2

        DisplayBoard(); // Display updated board
        return true;
    }

    //Returns the array position of a value on the board
    public int[] GetPosition(int value){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == value) {
                    return new int[]{i, j}; //Return the position [row, column]
                }
            }
        }
        return null;        //If value not found
    }

    //Returns the sum of the top row values together
    public int Row1Sum(){
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            sum += board[0][j];      //First row index = 0
        }
        return sum;
    }

    //Returns the sum of the first column values together
    public int Col1Sum() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += board[i][0];     //First column index = 0
        }
        return sum;
    }

    //Returns the sum of the middle row values together
    public int Row2Sum(){
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            sum += board[1][j];     //Middle row index = 1
        }
        return sum;
    }

    //Returns the sum of the middle column values together
    public int Col2Sum() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += board[i][1];     //Middle column index = 1
        }
        return sum;
    }

    //Returns the sum of the last row values together
    public int Row3Sum(){
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            sum += board[2][j];     //Last row index = 2
        }
        return sum;
    }

    //Returns the sum of the last column values together
    public int Col3Sum() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += board[i][2];     //Last  column index = 2
        }
        return sum;
    }

    //Returns the sum of values starting at top-left diangle to bottom-right
    public int DiagonalLeftSum() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += board[i][i]; // Sum of elements from top-left to bottom-right
        }
        return sum;
    }

    //Returns the sum of values starting at bottom-right diangle to top-left
    public int DiagonalRightSum() {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += board[i][2 - i]; // Sum of elements from top-right to bottom-left
        }
        return sum;
    }

    //Print all sums to the screen
    public void DisplaySums(){
        System.out.println("Row 1: \t \t \t \t"+ Row1Sum());
        System.out.println("Column 1: \t \t \t"+ Col1Sum());
        System.out.println("Row 2: \t \t \t \t"+ Row2Sum());
        System.out.println("Column 2: \t \t \t"+ Col2Sum());
        System.out.println("Row 3: \t \t \t \t"+ Row3Sum());
        System.out.println("Column 3: \t \t \t"+ Col3Sum());
        System.out.println("Diagonal Left: \t \t \t"+ DiagonalLeftSum());
        System.out.println("Diagonal Right: \t \t"+ DiagonalRightSum());
        System.out.println();
    }

    //Check if all sums equal 15
     public boolean checkAllSumsEqual15() {     //Returns true if all sums equal 15
        return Row1Sum() == 15 &&
               Col1Sum() == 15 &&
               Row2Sum() == 15 &&
               Col2Sum() == 15 &&
               Row3Sum() == 15 &&
               Col3Sum() == 15 &&
               DiagonalLeftSum() == 15 &&
               DiagonalRightSum() == 15;
    }
}
