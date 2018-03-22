import java.util.ArrayList;

public class Exercise10_1 {
    public static <E> void reverseList(E[] list) {
        for (int i = list.length-1; i >= 0; i--) {
            System.out.println(list[i]);
        }
    }

    public static void main( String[] args ) {
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        reverseList(doubleArray);

        System.out.println();

        String[] stringArray = {"The", "Brown", "Fox", "Jumps", "Over", "The", "Dog"};
        reverseList(stringArray);
    }
}

// Output:
/*
5.0
4.0
3.0
2.0
1.0

Dog
The
Over
Jumps
Fox
Brown
The
*/