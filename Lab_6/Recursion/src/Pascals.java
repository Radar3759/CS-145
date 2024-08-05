/*
Name: Clarissa Lacefield
Class: CS145
Assignment: Lab 6, Pascal's Triangle
Date: 8/2/2024
Extra Credit: I made the program check to see if the number entered is between 1-25
Notes: I used deftstack.com, geeksforgeeks.org, and baeldung.com for pascal formulas. 
'numY' is a bad var name. I needed it to be not a single char so I could 'see' it
*/

//write a program to print pascal's triangle here
import java.util.Scanner;
class Pascals {
    public static void main(String[] args) {
        //allow input
        Scanner input = new Scanner(System.in);
        boolean win = false; //init while loop to keep asking for the correct number range
            while (win == false) {
            //asks for user to input a num between 1-25
            System.out.printf("%nEnter a number between 1 and 25: ");
            //assigns the int given by the user to the var 'num'
            int numY= input.nextInt();
                if(numY < 1 || numY > 25) {
                    System.out.printf("%nThe number must be between 1 and 25");
                } else {
                    //loop through nums from 1-numY
                    for (int i = 0; i < numY; i++) {
                        //prints spaces
                        for(int k = 1; k < numY - i; k++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j <= i; j++) {
                            System.out.printf(nCr(i,j)+ " "); //calls the nCr(i,j) method to calc the bionomial coeffiecients and print them
                        }
                        System.out.println();
                        win = true; //close the while loop
                        input.close(); //closes the Scanner input
                    }
                }
            } //ends while
    } //ends main
    /*makes the formula for binomial coeffiecients (what pascal's triangle is formed of) work. I took this directly from deftstack.com*/
    private static int nCr(int n, int r) {
        //establishes a count of one for numerator and denomoniator
        int numerator = 1;
        int denominator = 1;
        //n is numY from above
        if (n < r || n == 0)
            return 1;

        for (int s = r; s >= 1; s--) {
            numerator = numerator * n--;
            denominator = denominator * s;
        }
        return (numerator / denominator);
    }

}