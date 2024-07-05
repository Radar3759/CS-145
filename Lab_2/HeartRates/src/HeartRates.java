/* 
Student: Clarissa Lacefield
Class: CS145
Lab: Lab 2 Heart Rate Calculator
Extra Credit: set current year automatically 
*/

public class HeartRates {
    
    //class attributes should include fname/lName/yob/current year
    private String fName;
    private String lName;
    private int birthYear;
    private int currentYear = java.time.Year.now().getValue();
    private int ageYears;
    private int maxRate;
    private double targetRateMin;
    private double targetRateMax;

    //create a constructor the receives data as a parameter
    //fig 7.5 pg 257, White book & assignment instructions
    public HeartRates(String fName, String lName, int birthYear, int currentYear) {
        this.fName = fName;
        this.lName = lName;
        this.birthYear = birthYear;
        this.currentYear = currentYear;
        getAgeYears();
        getMaxRate();
        getTargetRateMin();
        getTargetRateMax();
    }

    //use a method to set the first name in the object, account.java examples
    public void setFName(String fName) {
        this.fName = fName;
    }

    //use a method to get the first name in the object
    public String getFName() {
        return fName;
    }

    //use a method to set the last name in the object, account.java examples
    public void setLName(String lName) {
        this.lName = lName;
    }

    //use a method to get the last name in the object
    public String getLName() {
        return lName;
    }

    //use a method to set the birthYear in the object, account.java examples
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    //use a method to get the birth year in the object
    public int getBirthYear(){
        return birthYear;
    }

    //use a method to set the currentYear in the object, account.java examples
    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;
    }

    //use a method to get the current in the object
    public int getCurrentYear(){
        return currentYear;
    }

    //use a method to set age
    public void setAgeYears() {
        this.ageYears = currentYear - birthYear;
    }

    public int getAgeYears() {
        return ageYears;
    }

    //calculate max heart rate by age, use a method to set it
    public void setMaxRate() {
        int age = ageYears;
        maxRate = 220 - age;
    } 

    public int getMaxRate() {
        return maxRate;
    }

    //calculate target heart rate min
    public void setTargetRateMin() {
        double targetMin = (double) maxRate;
        this.targetRateMin = (targetMin * .50); //use double for percentages
    }

    public double getTargetRateMin() {
        return targetRateMin;
    }

    //calculate target heart rate max
    public void setTargetRateMax() {
        double targetMax = (double) maxRate;
        targetRateMax = (targetMax * .85);
    }

    public double getTargetRateMax() {
        return targetRateMax;
    }

    //empty constructor solves undefined constructor issue per stack overflow
    public HeartRates() {

    }

} //end HeartRates