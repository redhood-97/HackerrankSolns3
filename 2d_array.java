static int hourglassSum(int[][] arr) {

        int max = arr[1][1] + arr[0][1] + arr[0][0] + arr[0][2] + arr[2][0] + arr[2][1] + arr[2][2];
        int[][] result = new int[4][4];

        for(int i = 1; i < 5; i++)
        {   
            int sum = 0;
            for(int j = 1; j < 5; j++)
            {
                sum = arr[i][j] + arr[i-1][j] + arr[i-1][j-1] + arr[i-1][j+1] + arr[i+1][j] + arr[i+1][j-1] + arr[i+1][j+1];
                if(sum > max)
                    max = sum;
             }
        }
        return max;
    }
