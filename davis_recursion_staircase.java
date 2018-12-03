

// Problem Davis's Recursion Staircase

static int stepPerms(int n) {

        if(n == 1)
        {
            return 1;
        }
        else if(n == 2)
        {
            return 2;
        }
        else if(n == 3)
        {
            return 4;
        }

        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;

        for(int i = 3; i < n; i++)
        {
            arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
        }

        return arr[arr.length - 1];
         
    }
