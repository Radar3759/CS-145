/*
Name: Clarissa Lacefield
Date: 6/26/24
Class: CS&145 Online
Lab 1: Guessing Game
Purpose: Have the user guess a number and provide feedback if the entry is corret/too high/too low
Source: 90% of this was copied from my CS&141 project from last quarter that was similar. I got it to work for this assignment (woot!) and adjusted the code to add/remove features specific to this lab. 
*/

import java.util.Scanner;
import java.security.SecureRandom;

public class Guess {
    public static void main(String[] args) throws Exception {
        // allows for input
        Scanner input = new Scanner(System.in);
        // allows for random nums
        SecureRandom randomNumbers = new SecureRandom();
        //calls the introduction method
        introduction();

        //ask the user for a starting number
        System.out.printf("%nGuess a number between 1-1000 ");
        // use assigned var instead of input here to start the loop 
        String again = "y";   
        //only looks at the first char of the string and makes it lower case
        while (again.toLowerCase().charAt(0) == 'y') {
            // picks a random number between 1 and 100
            int random = 1 + randomNumbers.nextInt(1000);
            // Prints the random number for testing
            System.out.printf("The number is " + random +"%n"); 
            // call the game method
            int guesses = playGame(input, random);
            // print the number of guesses
            System.out.printf("It took you "+ guesses + " guess(es)!%n");
            // ask if user would like to play again?
            System.out.printf("%nWould you like to play again? Y/N ");
            //input var for y/n
            again = input.next();    
        }
        input.close(); //closes the input
    } //end main

    // introduction method
    public static void introduction() {
    // these print statments are the intro
    System.out.printf("%nThis program allows you to play a guessing game.%n");
    System.out.printf("I will think of a number between 1 and 1000 and will%n");
    System.out.printf("allow you to guess until you get it. For each guess,%n");
    System.out.printf("I will tell you whether the right answer is higher%n");
    System.out.printf("or lower than your guess.%n");
    
    } // end introduction

    // playGame method holds the while loop
    public static int playGame(Scanner input, int random) {
        boolean win = false; // keeps the while loop running
        int count = 0; //inits a counter

        while (win == false){ 
        // ask for input num between 1-100
        System.out.printf("%nPlease enter a number between 1 and 1000: ");
        int userNum = input.nextInt();
        if(userNum == random)   {
            win = true; // ends the while loop
            count++; //increments the count
            //prints a congrats statement
            System.out.printf("You guessed the correct number!!%n");
        } else if (userNum < random) {
            count++;
            System.out.printf(userNum + " is too low. Guess again.%n");

        } else if (userNum > random) {
            System.out.printf(userNum + " is too high. Guess again.%n");
            count++;
        } 
        }  // end while loop       
        return count;
    }// end playGame     

} //end Guess
