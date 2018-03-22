import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Exercise9_2 {


    public static void main( String[] args ) {
        Customer[] custArray;
        custArray = makeCustArray();
    }

    public static Customer[] makeCustArray() {
        Customer[] custArray;
        int numElems;
        String name;
        long acct;
        double bal;

        java.io.File file = new java.io.File("input.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        numElems = scanner.nextInt();
        scanner.nextLine();
        if (numElems <= 0) {
            numElems = 1;
        }

        custArray = new Customer[numElems];

        for (int i = 0; i < custArray.length; ++i) {
            name = scanner.nextLine();
            acct = scanner.nextLong();
            bal = scanner.nextDouble();
            scanner.nextLine();
            custArray[i] = new Customer(name, acct, bal);
        }
        return custArray;
    }
}
