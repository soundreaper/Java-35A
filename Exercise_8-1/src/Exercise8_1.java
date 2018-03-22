import java.util.*;

public class Exercise8_1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main( String [] args ) {
        int [][] twoDimArray;
        twoDimArray = allocateTwoDimArray();
        fillTwoDimArray(twoDimArray);
    }

    public static int[][] allocateTwoDimArray() {
        int dim1, dim2;

        while (true) {
            try {
                System.out.print("Enter number of rows: ");
                dim1 = scanner.nextInt();
                if (dim1 < 1)
                    dim1 = 1;

                System.out.print("Enter number of columns: ");
                dim2 = scanner.nextInt();
                if (dim2 < 1)
                    dim2 = 1;

                return new int[dim1][dim2];
            } catch (InputMismatchException exp) {
                System.err.println("Non-Integer Value Entered!");
                scanner.next();
            }
        }
    }

    public static void fillTwoDimArray(int [][] twoDimArray) {
        if( twoDimArray != null) {
            for( int row=0; row < twoDimArray.length; ++row ) {
                for( int col=0; col < twoDimArray[row].length; ++col ) {
                    twoDimArray[row][col]=10*row+col;
                }
            }
        }
    }
}