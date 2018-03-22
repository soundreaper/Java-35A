public class Exercise2_1 {

    public static void main( String[] args ) {
        int num1 = 0xFEDC;
        int num2 = 0;

        int mask = 240;
        mask = mask & num1;
        mask = mask << 4;
        num2 = mask;

        System.out.println(Integer.toBinaryString(num1));
        System.out.println(Integer.toBinaryString(num2));
    }

}

// Output:
/*
    1111111011011100
    0000110100000000
    0000110100000000
 */