// Play Sudoku
// Subal Pant
// 02/05/2018
// System: Mac OS X - High Sierra, Compiler: IntelliJ IDEA
/*
    This program is a game that allows the user to play Sudoku. It fills a two-dimensional array
    with numbers between 1 to 9 and then randomizes their locations. It then creates random blanks in array
    so that the use can "solve" the puzzle. Once the user places all the missing numbers in the correct spot,
    the game will finish.
 */


import java.util.Scanner;
import java.util.Arrays;

public class Sudoku {
    public static int[][] fillPuzzle(int[][] unfilledPuzzle) {
        unfilledPuzzle[0][0] = 1; unfilledPuzzle[0][1] = 2; unfilledPuzzle[0][2] = 3;
        unfilledPuzzle[0][3] = 4; unfilledPuzzle[0][4] = 5; unfilledPuzzle[0][5] = 6;
        unfilledPuzzle[0][6] = 7; unfilledPuzzle[0][7] = 8; unfilledPuzzle[0][8] = 9;

        unfilledPuzzle[1][0] = 4; unfilledPuzzle[1][1] = 5; unfilledPuzzle[1][2] = 6;
        unfilledPuzzle[1][3] = 7; unfilledPuzzle[1][4] = 8; unfilledPuzzle[1][5] = 9;
        unfilledPuzzle[1][6] = 1; unfilledPuzzle[1][7] = 2; unfilledPuzzle[1][8] = 3;

        unfilledPuzzle[2][0] = 7; unfilledPuzzle[2][1] = 8; unfilledPuzzle[2][2] = 9;
        unfilledPuzzle[2][3] = 1; unfilledPuzzle[2][4] = 2; unfilledPuzzle[2][5] = 3;
        unfilledPuzzle[2][6] = 4; unfilledPuzzle[2][7] = 5; unfilledPuzzle[2][8] = 6;

        unfilledPuzzle[3][0] = 2; unfilledPuzzle[3][1] = 3; unfilledPuzzle[3][2] = 4;
        unfilledPuzzle[3][3] = 5; unfilledPuzzle[3][4] = 6; unfilledPuzzle[3][5] = 7;
        unfilledPuzzle[3][6] = 8; unfilledPuzzle[3][7] = 9; unfilledPuzzle[3][8] = 1;

        unfilledPuzzle[4][0] = 5; unfilledPuzzle[4][1] = 6; unfilledPuzzle[4][2] = 7;
        unfilledPuzzle[4][3] = 8; unfilledPuzzle[4][4] = 9; unfilledPuzzle[4][5] = 1;
        unfilledPuzzle[4][6] = 2; unfilledPuzzle[4][7] = 3; unfilledPuzzle[4][8] = 4;

        unfilledPuzzle[5][0] = 8; unfilledPuzzle[5][1] = 9; unfilledPuzzle[5][2] = 1;
        unfilledPuzzle[5][3] = 2; unfilledPuzzle[5][4] = 3; unfilledPuzzle[5][5] = 4;
        unfilledPuzzle[5][6] = 5; unfilledPuzzle[5][7] = 6; unfilledPuzzle[5][8] = 7;

        unfilledPuzzle[6][0] = 3; unfilledPuzzle[6][1] = 4; unfilledPuzzle[6][2] = 5;
        unfilledPuzzle[6][3] = 6; unfilledPuzzle[6][4] = 7; unfilledPuzzle[6][5] = 8;
        unfilledPuzzle[6][6] = 9; unfilledPuzzle[6][7] = 1; unfilledPuzzle[6][8] = 2;

        unfilledPuzzle[7][0] = 6; unfilledPuzzle[7][1] = 7; unfilledPuzzle[7][2] = 8;
        unfilledPuzzle[7][3] = 9; unfilledPuzzle[7][4] = 1; unfilledPuzzle[7][5] = 2;
        unfilledPuzzle[7][6] = 3; unfilledPuzzle[7][7] = 4; unfilledPuzzle[7][8] = 5;

        unfilledPuzzle[8][0] = 9; unfilledPuzzle[8][1] = 1; unfilledPuzzle[8][2] = 2;
        unfilledPuzzle[8][3] = 3; unfilledPuzzle[8][4] = 4; unfilledPuzzle[8][5] = 5;
        unfilledPuzzle[8][6] = 6; unfilledPuzzle[8][7] = 7; unfilledPuzzle[8][8] = 8;

        for (int currentNum = 1; currentNum <= 9; currentNum++) {
            int randInt;

            do {
                randInt = (int)((Math.random() * (9 - 1)) + 1);
            } while (randInt == currentNum);

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (unfilledPuzzle[i][j] == currentNum) {
                        unfilledPuzzle[i][j] = randInt;
                    }
                    else if (unfilledPuzzle[i][j] == randInt) {
                        unfilledPuzzle[i][j] = currentNum;
                    }
                }
            }
        }

        int temp = 0;

        for (int i = 0; i < 7; i += 3) {
            int randRow = (int)((Math.random() * (2 - 1)) + 1);
            for (int j = 0; j < 9; j++) {
                temp = unfilledPuzzle[i][j];

                unfilledPuzzle[i][j] = unfilledPuzzle[i+randRow][j];
                unfilledPuzzle[i+randRow][j] = temp;
            }
        }

        for (int i = 0; i < 7; i += 3) {
            int randCol = (int)((Math.random() * (2 - 1)) + 1);
            for (int j = 0; j < 7; j+=3) {
                temp = unfilledPuzzle[i][j];

                unfilledPuzzle[i][j] = unfilledPuzzle[i][j+randCol];
                unfilledPuzzle[i][j+randCol] = temp;
            }
        }

        return unfilledPuzzle;
    }

    public static int[][] copyPuzzle(int[][] array1, int[][] array2) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                array2[i][j] = array1[i][j];
            }
        }

        return array2;
    }

    public static int[][] setPuzzleHoles(int[][] filledPuzzle) {
        //int numHoles = 1; //Use this for a sudoku puzzle with only one hole to check if the compare method works quickly.
        int numHoles = (int)((Math.random() * (36 - 25)) + 25);

        for (int k = 1; k <= numHoles; k++) {
            int randRow = (int)((Math.random() * (9 - 1)) + 1);
            int randCol = (int)((Math.random() * (9 - 1)) + 1);

            if (filledPuzzle[randRow][randCol] != 0) {
                filledPuzzle[randRow][randCol] = 0;
            }
        }

        return filledPuzzle;
    }

    public static void displayPuzzle(int[][] puzzle) {
        System.out.println("\t|\t1\t2\t3\t|\t4\t5\t6\t|\t7\t8\t9\t");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for (int i = 0; i < 9; i++) {
            System.out.print(" " + (i+1) + "  |\t");

            for (int j = 0; j < 9; j++) {
                if (puzzle[i][j] == 0) {
                    System.out.print(" " + "\t");
                }
                else {
                    System.out.print(puzzle[i][j] + "\t");
                }

                if (j == 2 || j == 5) {
                    System.out.print("|\t");
                }
            }

            if (i == 2 || i == 5) {
                System.out.print("\n- - - - - - - - - - - - - - - - - - - - - - - - - - -");
            }

            System.out.println();
        }
    }

    public static String setPuzzleSpot(int [][] puzzle) {
        int row, col, value;
        int minVal = 1, maxVal = puzzle.length;

        Scanner userScanner = new Scanner(System.in);
        System.out.print("\nEnter row, column, and value to set (sep. by a space): ");
        row = userScanner.nextInt() - 1; // adjust for 0 through 8
        col = userScanner.nextInt() - 1; // adjust for 0 through 8
        value = userScanner.nextInt();
        if ( row < 0 || row >= maxVal || col < 0 || col >= maxVal || value < minVal || value > maxVal) {
            return "Invalid input, must be "+minVal + " to " + maxVal + ", inclusive!";
        } else if( !isValidPlacement(puzzle, row, col, value)) {
            return "You can't place that value there!" ;
        }

        // place the value
        puzzle[row][col] = value;
        return "Number placed!";
    }

    public static boolean isValidPlacement(int [][] puzzle, int row, int col, int value) {
        if( puzzle[row][col] != 0 ) // not empty?
            return false;
        // check if in the same row and column
        for( int i=0; i < puzzle.length; ++i ){
            if( puzzle[i][col] == value || puzzle[row][i] == value)
                return false;
        } // end checking same row and column

        // check if in its sub-square
        int begRow, begCol, endRow, endCol;
        begRow = 3* (row/3);
        endRow = begRow + 3;
        begCol = 3* (col/3);
        endCol = begCol + 3;
        for( int subrow = begRow; subrow < endRow ; ++subrow ){
            for( int subcol = begCol; subcol < endCol; ++subcol )
                if( puzzle[subrow][subcol] == value )
                    return false;
        } // end checking block
        return true;
    } // end isValidPlacement

    public static boolean comparePuzzles(int[][] userPuzzle, int[][] puzzleAnswer) {
        if (Arrays.deepEquals(userPuzzle, puzzleAnswer) == true) {
            return true;
        }
        return false;
    }

    public static boolean wantsToContinue(String prompt) {
        String answer;

        Scanner userScanner = new Scanner(System.in);
        System.out.print(prompt + " (y for yes): ");
        answer = userScanner.next();
        return answer.charAt(0)=='y' || answer.charAt(0)=='Y';
    } // end wantsToRepeat

    public static void playSudoku(int[][] userPuzzle, int[][] puzzleAnswer) {
        while (true) {
            System.out.println();
            displayPuzzle(userPuzzle);
            String setPuzzleReturn = setPuzzleSpot(userPuzzle);
            System.out.println(setPuzzleReturn);

            if (setPuzzleReturn == "Number placed!") {
                boolean compareBool = comparePuzzles(userPuzzle, puzzleAnswer);

                if (compareBool == true) {
                   System.out.println("Congratulations! You solved the puzzle!");
                   break;
                }
            }

            boolean continueBool = wantsToContinue("Keep playing?");

            if (continueBool == false) {
                break;
            }
        }
    }

    public static void main ( String[] args ) {
        int[][] userPuzzle = new int[9][9];
        int[][] puzzleAnswer = new int[9][9];

        while (true) {
            fillPuzzle(puzzleAnswer);
            copyPuzzle(puzzleAnswer, userPuzzle);

            displayPuzzle(puzzleAnswer); //Uncomment this to see the finished puzzle for debugging.

            setPuzzleHoles(userPuzzle);
            playSudoku(userPuzzle, puzzleAnswer);

            System.out.println();
            boolean playAgain = wantsToContinue("Play another?");

            if (playAgain == false) {
                break;
            }
        }
    }
}

// Output:
/*

Valid Input:
	|	1	2	3	|	4	5	6	|	7	8	9
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 1  |	1	2	3	|	6	4	8	|	7	9	5
 2  |	7	9	0	|	1	0	3	|	6	4	8
 3  |	6	4	0	|	7	9	5	|	1	2	3
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 4  |	3	1	4	|	0	0	0	|	0	7	2
 5  |	5	7	0	|	0	1	4	|	0	6	9
 6  |	8	0	9	|	0	0	0	|	3	1	4
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 7  |	4	0	0	|	0	0	0	|	2	0	0
 8  |	2	0	0	|	4	3	6	|	9	8	7
 9  |	9	0	0	|	0	0	1	|	0	3	6

Enter row, column, and value to set (sep. by a space): 2 3 5
Number placed!
Keep playing? (y for yes): y

Invalid Input:
(Incorrect Value)
	|	1	2	3	|	4	5	6	|	7	8	9
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 1  |	4	2	7	|	1	3	8	|	5	6	9
 2  |	5	6	0	|	0	2	7	|	1	3	0
 3  |	1	3	8	|	5	6	9	|	4	0	7
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 4  |	7	4	3	|	0	1	0	|	9	5	2
 5  |	9	5	2	|	0	0	0	|	8	0	6
 6  |	8	0	6	|	0	0	2	|	7	4	3
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 7  |	3	7	0	|	6	8	5	|	2	9	0
 8  |	2	9	0	|	0	7	0	|	0	0	5
 9  |	6	8	5	|	2	0	0	|	3	7	0

Enter row, column, and value to set (sep. by a space): 2 3 4
You can't place that value there!
Keep playing? (y for yes):

(Trying to Place Value where it already exists)
	|	1	2	3	|	4	5	6	|	7	8	9
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 1  |	6	4	8	|	9	2	3	|	1	5	7
 2  |	1	5	7	|	6	4	0	|	9	0	3
 3  |	9	2	0	|	0	0	7	|	0	4	8
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 4  |	8	6	2	|	3	9	0	|	7	1	4
 5  |	7	1	0	|	0	6	2	|	3	0	5
 6  |	3	9	5	|	7	1	0	|	0	0	2
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 7  |	2	8	0	|	0	3	1	|	0	7	6
 8  |	4	0	6	|	0	8	0	|	5	3	1
 9  |	5	3	1	|	4	0	0	|	0	0	9

Enter row, column, and value to set (sep. by a space): 1 1 6
You can't place that value there!
Keep playing? (y for yes):

User Solving:
	|	1	2	3	|	4	5	6	|	7	8	9
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 1  |	1	3	2	|	4	5	6	|	8	7	9
 2  |	8	7	9	|	1	3	2	|	4	5	6
 3  |	4	5	6	|	8	7	9	|	1	3	2
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 4  |	2	1	5	|	6	4	7	|	9	8	3
 5  |	9	8	3	|	2	1	5	|	6	4	7
 6  |	6	4	7	|	9	8	3	|	2	1	5
- - - - - - - - - - - - - - - - - - - - - - - - - - -
 7  |	5	2	4	|	7	6	8	|	3	9	1
 8  |	3	9	1	|	5	2	4	|	7	6	8
 9  |	7	6	8	|	3	9	1	|	5	2	0

Enter row, column, and value to set (sep. by a space): 9 9 4
Number placed!
Congratulations! You solved the puzzle!

 */