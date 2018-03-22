public class Exercise3_1 {
    public static double MyMath(double var) {
        return Math.round(var * 100) / 100;
    }

    public static void TryMyMath(double var) {
        System.out.println(MyMath(var));
        System.out.println(MyMath(Math.pow(var, 1.0/2.0)));
        System.out.println(MyMath(Math.pow(var, 1.0/3.0)));
    }

    public static void main( String[] args ) {
        TryMyMath(1000.0 * Math.E);
    }
}

// Output:
/*
    2718.0
    52.0
    13.0
 */