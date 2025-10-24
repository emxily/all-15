public class RunAll15 {
    public static void main(String[] args) {
        GameBoard gameBoard = new  GameBoard();     //New GameBoard object

        gameBoard.ShuffleBoard();       //Shuffle the board first

        int swapCount = 0;      //Holds number of swaps it takes to make all sums equal 15

        //Loop while all sums do not equal 15
        while (!gameBoard.checkAllSumsEqual15()) {
            if (gameBoard.SwapNumbers()) {      //If a swap is completed add 1 to swapCount
                swapCount++;
                System.out.println("Board Not Complete!");
                gameBoard.DisplaySums();
                
            }
        }
        //Once all sums equal 15 print swapCount and end game
        System.out.println("Board Complete!");
        System.out.println("Number Of Moves: \t \t" + swapCount);

    
    }
}

