// Number Palindrome Creator REDUX
// Subal Pant
// 03/17/2018
// System: Windows 10 Pro, Compiler: IntelliJ IDEA
/*

 */

import java.util.Scanner;

public class Prog4 {
    public static Scanner userInput = new Scanner(System.in);

    public static NumberString[] numStringInput() {
        int size = 0;

        System.out.print("How many numbers do you want to create palindromes? ");
        size = userInput.nextInt();
        userInput.nextLine();

        if (size <= 0) {
            size = 1;
        }

        NumberString[] numStringArray = new NumberString[size];
        String number = "";

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number #" + (i+1) + ": ");
            number = userInput.nextLine();
            numStringArray[i] = new NumberString(number);
        }

        return numStringArray;
    }

    public static void printPalindrome(NumberString[] numStringArr) {
        System.out.printf("%-15s", "Number");
        System.out.printf("Generated Palindrome\n");

        for (int i = 0; i < numStringArr.length; i++) {
            System.out.printf("%-15s", numStringArr[i].getNumStr());
            System.out.printf(numStringArr[i].getNumStrPalin() + "\n");
        }
    }

    public static void main( String[] args) {
        NumberString[] numStringArray;
        numStringArray = numStringInput();
        System.out.println();
        printPalindrome(numStringArray);
    }
}

// Output:

/*

Run 1:
How many numbers do you want to create palindromes? 5
Enter number #1: 13579
Enter number #2: 468
Enter number #3: 98
Enter number #4: 97568
Enter number #5: 545

Number         Generated Palindrome
13579          122221
468            3663
98             8813200023188
97568          893974888888479398
545            545

Run 2:
How many numbers do you want to create palindromes? 0
Enter number #1: 123123123

Number         Generated Palindrome
123123123      444444444

Run 3:
How many numbers do you want to create palindromes? 8
Enter number #1: 99888
Enter number #2: 7
Enter number #3: -22
Enter number #4: one?
Enter number #5: 76.543
Enter number #6: 9898989898
Enter number #7: 98787
Enter number #8: 88

Number         Generated Palindrome
99888          12695991019959621
7              7
0              Invalid Parameter
0              Invalid Parameter
0              Invalid Parameter
9898989898     No Solution < 200 digits
98787          4456268448626544
88             88

 */
