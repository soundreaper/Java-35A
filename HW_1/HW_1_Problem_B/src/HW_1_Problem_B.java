// Problem B
// Subal Pant
// 01/22/2018
// System: Mac OS X - High Sierra, Compiler: IntelliJ IDEA
/*
    This program is to print the chances of winning a lottery system. The
    probability is calculated with a provided formula and the odds are printed
    by formatting the text.
 */

public class HW_1_Problem_B {
    public static double factorial(int var) {
        double fact = 1.0;
        for (int i = 1; i <= var; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main( String[] args ) {
        final int n_min = 37;
        final int n_max = 69;

        final int r_min = 5;
        final int r_max = 6;

        System.out.println("\t n\t\t\t\tr = 5\t\t\t\t\t\t\tr = 6");
        for (int i = n_min; i <= n_max; i+=2) {
            double winning_combo_r_min = factorial(i)/(factorial(r_min) * factorial(i - r_min));
            double winning_combo_r_max = factorial(i)/(factorial(r_max) * factorial(i - r_max));

            System.out.print("\t" + i + "\t\t1 in\t");
            System.out.printf("%14.1f", winning_combo_r_min);
            System.out.print("\t\t\t1 in\t");
            System.out.printf("%14.1f\n", winning_combo_r_max);
        }
    }
}

// Output:
/*
	 n				r = 5							r = 6
	37		1 in	      435897.0			1 in	     2324784.0
	39		1 in	      575757.0			1 in	     3262623.0
	41		1 in	      749398.0			1 in	     4496388.0
	43		1 in	      962598.0			1 in	     6096454.0
	45		1 in	     1221759.0			1 in	     8145060.0
	47		1 in	     1533939.0			1 in	    10737573.0
	49		1 in	     1906884.0			1 in	    13983816.0
	51		1 in	     2349060.0			1 in	    18009460.0
	53		1 in	     2869685.0			1 in	    22957480.0
	55		1 in	     3478761.0			1 in	    28989675.0
	57		1 in	     4187106.0			1 in	    36288252.0
	59		1 in	     5006386.0			1 in	    45057474.0
	61		1 in	     5949147.0			1 in	    55525372.0
	63		1 in	     7028847.0			1 in	    67945521.0
	65		1 in	     8259888.0			1 in	    82598880.0
	67		1 in	     9657648.0			1 in	    99795696.0
	69		1 in	    11238513.0			1 in	   119877472.0
 */