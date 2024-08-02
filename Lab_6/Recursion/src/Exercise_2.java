public class Exercise_2 {
    public int sum(int n) { 
        if (n == 0) {            
        return 0;          
        }         
    else {    
        /*corrected sum(n) to sum(n - 1) so that it decrements n from n to 0
        otherwise it's an infinite loop of 0 */
        return n + sum(n - 1);   
    }   
}
}
