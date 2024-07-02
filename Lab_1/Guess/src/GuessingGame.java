/*
Name: Clarissa Lacefield
Date: 7/3/2024
Class: CS145
Lab 1: Guessing Game
Purpose: Have the user guess a number and provide feedback if the entry is corret/too high/too low

Source: 90% of this was copied from my CS&141 project from last quarter. 
I got it to work for this assignment (woot!) 
*/

import java.util.Scanner; //import for user input
import java.security.SecureRandom; //import for random nums

public class GuessingGame {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in); // allows for input
        SecureRandom randomNumbers = new SecureRandom(); // allows for random nums
        
        int totalGames = 0; // init counter for total num of games played
        int totalGuess = 0; // init counter for total num of guesses
        int bestGame = 100; // keeps top score, start at 100, to give an easy goal
        int gameAvg = 0; // inits the guess/game average

        introduction(); //calls the introduction method
        String again = "y"; //inits the while loop

        // only looks at the first char of the string and makes it lower case
        while (again.toLowerCase().charAt(0) == 'y') {
            // picks a new random number between 1 and 1000
            int random = 1 + randomNumbers.nextInt(1000); 
            //get the number of guesses for the current game
            int count = playGame(input, random); 
            //change bestGame num if the current guesses are less
            if (count < bestGame) { 
                bestGame = count;
            }
            //add current game guessses to guess total
            totalGuess += count;
            //increment the game counter
            totalGames++;
            //update guess average
            gameAvg = totalGuess / totalGames;
            // ask if user would like to play again?
            System.out.printf("%nWould you like to play again? Y/N ");
            //input var for y/n
            again = input.next();    
        }
        // calls the report method to report stats when the user is done playing
        report(totalGames, bestGame, totalGuess, gameAvg);
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
        int count = 0; //inits a counter for current game guesses
        
        while (win == false){ 
        // ask for input num between 1-100
        System.out.printf("%nPlease enter a number between 1 and 1000: ");
        int userNum = input.nextInt();
            if(userNum == random)   {
                win = true; // ends the while loop
                count++; //increments the count
                //prints a congrats statement
                System.out.printf("%nYou guessed the correct number!!%n");
                // handle if the user guesses it on the first try. 
                if(count == 1) {
                    System.out.printf("You got it right in 1 guess%n");
                    // totalGames++;
                } else {
                    // print the number of guesses
                    System.out.printf("You got it right in "+ count + " guess(es)!%n");
                }
            // if the guess is too low
            } else if (userNum < random) {
                //increment the count
                count++;
                //print a message that says the guess is too low
                System.out.printf(userNum + " is too low. Guess again.%n");
            // if the guess is too high
            } else if (userNum > random) { 
                //increment the count
                count++;
                //print a message the says the guess is too high
                System.out.printf(userNum + " is too high. Guess again.%n");
            }
        }// end while loop
    return count;  //allows var count to be used outside this method
    }// end playGame
    
//report method holds the game stats
    public static void report(int totalGames, int bestGame, int totalGuess, int gameAvg) {
        //prints a title
        System.out.printf("%nGame Stats:"); 
        //prints the least number of guesses in a game
        System.out.printf("%nYour best game: " + bestGame + " guesses");
        // print the number of games played
        System.out.printf("%nYou played " + totalGames + " game(s)");
         // print total num guesses
        System.out.printf("%nYour total number of guesses: " + totalGuess);
        // print average guesses
        System.out.printf("%nYour average number of guesses: " + gameAvg + "%n");
        
    }  //  ends report
        
} //ends Guess