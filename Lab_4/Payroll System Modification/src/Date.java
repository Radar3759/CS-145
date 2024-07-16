public class Date {
    private int month;
    private int day;
    private int year;

    //starts at zero to account for array count starts at 0, months at 1
    private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year) {
        //checks if the month is 1-12
        if(month <= 0 || month > 12) { 
        throw new IllegalArgumentException (
            "month (" + month + ") must be 1-12");
        }   
        //check if the date is range for the month
        if(day <=0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))){
            throw new IllegalArgumentException (
            "day (" + day + ") out of range for month and year");
        }
        //check for leap year
        if (month == 2 && day == 29
            && !(year % 400 == 0 || 
            (year % 4 == 0 
            && year %100 !=0))) {
            throw new IllegalArgumentException (
            "day (" + day + ") out of range for month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        //print out the formatted string
        return String.format("%d/%d%d", month, day, year);

        }
}
