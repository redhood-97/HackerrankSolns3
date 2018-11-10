
// Code for Primality check with 0(n^1/2) time complexity

public class Solution {

    static String primality(int n) {

        String neg = "Not prime";
        
        String pos = "Prime";
        
        if(n <= 1)
            return neg;
        
        if(n <= 3)
            return pos;
        
        if(n % 2 == 0 || n % 3 == 0)
            return neg;
        
        for(int i = 5; i <= Math.sqrt(n); i = i + 2)
        {
            if(n % i == 0)
            {
                return neg;
            }
        }
        
        return pos;
    }