# all-15
The player must swap the numbers on a board until all rows, columns, and diagonals equal to 15 in the least amount of moves possible.

<br />

# Project Overview
The program is organized into two main files: RunAll15.java and GameBoard.java, which together implement a 3×3 number puzzle game where the player must make all rows, columns, and diagonals sum to 15. The RunAll15.java file contains the main driver class responsible for running the game. It creates a GameBoard object, shuffles the numbers from 1 to 9 across the board, and then repeatedly calls game methods while tracking the number of moves required to complete the puzzle. The GameBoard.java file defines the structure and behavior of the board, including methods to shuffle numbers, display the current board, swap two positions based on user input, and calculate the sums of all rows, columns, and diagonals. It also includes a verification method that checks whether all sums equal 15, which determines when the game ends. Together, these two files create an interactive logic-based puzzle where the player manually swaps numbers to achieve the correct configuration, with the program continuously updating and displaying the board’s state until the solution is reached.

## Original Assignment Requirements

<br />

# Getting Started
## Prerequisites

Before you begin, ensure you have met the following requirements:
* Java 8+

## Installing

* To install this program, clone or download this repository:

        git clone all-15.git

* Then, navigate into the project directory:

        cd all-15

## Executing program
* To run the program from the terminal:
        java .\RunAll15.java

### Example Output
```java .\RunAll15.java```
```

```

<br />

# Future Updates

* Update planned at a later time

# Version History
*0.1
    *Initial Release

<br />

# Authors

**Author:** Emily Nowak

*Based on **Program 2** by **Professor Stephen Harris** for CSC222: Object-Oriented Programming with Java at Tidewater Community College

<br />