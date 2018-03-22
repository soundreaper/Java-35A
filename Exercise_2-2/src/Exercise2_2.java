public class Exercise2_2 {
    public static void main( String[] args ) {
        int inum1 = 5;
        int inum2 = 8;

        inum1--;

        while (inum1 >= 0) {
            System.out.println(inum1--);
        }
    }
}

// Output:
/*
4
3
2
1
0
 */