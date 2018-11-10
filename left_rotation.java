

static int[] rotLeft(int[] a, int d) {

        int size = a.length;
        
        int final_pos = 0;
        
        int[] new_arr = new int[size];
        
        for(int i = 0; i < size; i++)
        {
            int cur_pos = i;
            
            if(cur_pos - d >= 0)
            {
                final_pos = cur_pos - d;
            }
            else
            {
                final_pos = size + (cur_pos - d);
            }
            
            new_arr[final_pos] = a[cur_pos];
        }
        
        return new_arr;
    }
