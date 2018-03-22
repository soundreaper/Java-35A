// Number Palindrome Creator
// Subal Pant
// 02/25/2018
// System: Mac OS X - High Sierra, Compiler: IntelliJ IDEA
/*
    This program is an application that allows the user to create number palindromes. The driver program fills a
    NumberString object array with user-inputed numbers and calculates a palindrome for each number. Next, each
    inputted number and its respective palindrome is printed. If the number is not a positive, integer number an error
    will be displayed. Also, if the palindrome is more than 200 digits an error will be displayed. The actual
    palindrome calculation is done inside the NumberString class file. The addition of the number and its reverse is
    done until a number that is the same forwards and backwards is generated. The addition is done one column at a time
    so as to not cause overflow.
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
