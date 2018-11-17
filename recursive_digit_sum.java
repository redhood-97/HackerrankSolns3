


    static int superDigit(String n, int k) {
        
        int temp_sum = 0;
        
        for(int i = 0; i < n.length(); i++)
        {
            temp_sum = temp_sum + Character.getNumericValue(n.charAt(i));
        }
        
        temp_sum = temp_sum * k; 
        
        if(String.valueOf(temp_sum).length() > 1)
            return superDigit(String.valueOf(temp_sum), 1);
        else
            return temp_sum;    
    }


    // Solution to Algorithms ---> Recursive Digit Sum
    // Doesn't work for 3 specific test-cases(7, 8 and 9) which supposedly have larger inputs
    // Couldn't think of shorter code than this.
