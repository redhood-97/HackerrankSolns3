
// Solution to Miscellaneous problems ---> Flipping Bits

 static int[] dec_to_bin(long n)
    {
        int[] arr = new int[32];
        
        int i = 31;
        
        while(n >= 1)
        {
            arr[i--] = (int) n % 2;
            
            n = n / 2; 
        }
        
        for(int j = 0; j <= i; j++)
        {
            arr[j] = 0;
        }
        
        return arr;
     }

    static long flippingBits(long n) {
    
        int[] arr = new int[32];
        
        arr = dec_to_bin(n);
        
        for(int i = 0; i <= 31; i++)
        {
            if(arr[i] == 1)
            {
                arr[i] = 0;
            }
            else
            {
                arr[i] = 1;
            }
        }
        
        long converted = 0;
        
        for(int i = 31; i >= 0; i--)
        {
            converted = converted + (long) Math.pow(2 * arr[i], 31 - i);
        }
        
        if(n % 2 != 0)
        {
            converted = converted - 1;
        }
        
        return converted;
        
    }