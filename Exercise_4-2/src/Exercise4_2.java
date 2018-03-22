import java.util.Scanner;

public class Exercise4_2 {
    public static int[][] sizeOfArray(int size1, int size2) {
        int[][] intArrayCreated;

        if (size1 < 1) {
            size1 = 1;
        }

        if (size2 < 1) {
            size2 = 1;
        }

        intArrayCreated = new int[size1][size2];
        return intArrayCreated;
    }

    public static void createIntArray(int[][] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                intArray[i][j] = (i * 10) + j;
            }
        }
    }

    public static void main( String[] args ) {
        int[][] intArray;

        Scanner scan = new Scanner(System.in);
        int size1 = scan.nextInt();
        int size2 = scan.nextInt();

        intArray = sizeOfArray(size1, size2);
        createIntArray(intArray);
    }
}
