static void minimumBribes(int[] arr) {
    
    int bribes = 0;
    int flag = 1;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] - i > 3)
            {
                flag=0;
                break;
            }
            for(int j = Math.max(0,arr[i] - 2); j < i; j++)
            {
                if(arr[j] > arr[i])
                    bribes++;
            }
        }
        if(flag==0)
            System.out.println("Too chaotic");
        else
            System.out.println(bribes);
    }
