/* 
Student: Clarissa Lacefield
Class: CS145
Lab: Lab 2 Heart Rate Calculator
Extra credit: made the current year auto populate
*/

// allows for input
import java.util.Scanner;

public class HeartRateCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // allows for input
        //create a HeartRates object and assign it to myHeartRates
        HeartRates myHeartRates = new HeartRates();
            //introduce HeartRate
            System.out.printf("%n~ Welcome to Target Heart Rate Calculator ~%n");
            //ask the user to input their first name
            System.out.printf("Enter your first name: ");
            //assigns the input to var firstName
            String firstName = input.nextLine();
            //assigns firstName to fName
            myHeartRates.setFName(firstName);
            //ask the user to input their last name
            System.out.printf("Enter your last name: ");
            //assigns the input to var lastName
            String lastName = input.nextLine();
            //assigns lastName to lName
            myHeartRates.setLName(lastName);
            //ask the user to input their year of birth
            System.out.printf("Enter the year you were born YYYY: ");
            //assigns the input to var birthYear
            int birthYear = input.nextInt();
            myHeartRates.setBirthYear(birthYear);

            myHeartRates.setAgeYears();
            myHeartRates.setMaxRate();
            myHeartRates.setTargetRateMin();
            myHeartRates.setTargetRateMax();

            System.out.printf("%n~ Your Target Heart Rate Calculator Results ~%n");
            System.out.printf("%nFirst Name: %s%n", myHeartRates.getFName());
            System.out.printf("Last Name: %s%n", myHeartRates.getLName());  
            System.out.printf("Age: %s%n", myHeartRates.getAgeYears());
            System.out.printf("Maximum Heart Rate: %s%n", myHeartRates.getMaxRate());
            System.out.printf("Target Heart Rate Range: %n");
            System.out.printf("\tMinimum: %.0f%n", myHeartRates.getTargetRateMin());
            System.out.printf("\tMaximum: %.0f%n%n", myHeartRates.getTargetRateMax());
        input.close();
    } //end main
} //end HeartRateCalc