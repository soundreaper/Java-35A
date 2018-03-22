import java.util.Scanner;

public class Exercise3_2 {

    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static int median(int a, int b, int c) {
        if (a > b && a < c) {
            return a;
        } else if (b > a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println("\nAverage: " + average(a, b, c));
        System.out.println("Median: " + median(a, b, c));
    }
}

// Output:
/*
    1
    3
    3

    Average: 2
    Median: 3
 */