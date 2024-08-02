/*
Name: Clarissa Lacefield
Class: CS145
Assignment: Lab 6, Ex 2
Date: 8/2/2024
*/


public class Exercise_2 {
    public int sum(int n) { 
        if (n == 0) {            
        return 0;          
        }         
    else {    
        /*corrected sum(n) to sum(n - 1) so that it decrements n from n to 0
        and sums all ints in between. Otherwise it's an infinite loop of 0 */
        return n + sum(n - 1);   
    }   
}
}
