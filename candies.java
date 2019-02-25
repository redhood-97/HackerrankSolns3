static long candies(int n, int[] arr) {
        long total = 0;
        int[] candies_arr = new int[n];
        Arrays.fill(candies_arr,1);
        
        for(int i = 1; i < n; i++)
            if(arr[i] > arr[i - 1])
                candies_arr[i] = candies_arr[i-1] + 1;

        for(int i = n-1; i > 0; i--)
            if(arr[i] < arr[i - 1])
                candies_arr[i-1] = Math.max(candies_arr[i-1], candies_arr[i] + 1);
        
        for(int i = 0; i < n; i++)
            total += (long)candies_arr[i];
        
        return total;
    }
