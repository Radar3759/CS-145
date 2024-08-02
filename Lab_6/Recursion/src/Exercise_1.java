/*
Name: Clarissa Lacefield
Class: CS145
Assignment: Lab 6, Ex 1
Date: 8/2/2024
*/
//what does this code do?

public class Exercise_1 {
    //takes in x2 integers as parameters 'a' and 'b'
    public int mystery(int a, int b) {
        //if b is equal to one, return the value of int a
        if (b == 1) {
            return a;
        // if b does not equal 1, return the value of int a + recursive method 'mystery(a, b-1)'   
        } else {
            return a + mystery(a, b - 1);
        }
    }
}
