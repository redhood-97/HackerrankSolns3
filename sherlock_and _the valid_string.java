static String isValid(String s) {

        int[] letters = new int[128];
        int max = 0;
        for(char c : s.toCharArray()) 
        {
            letters[(int)c]++;    
            if(x > max)
                max = x;
        }

        int non_zero = 0;
        for(int i = 0; i < letters.length; i++)
        {
            if(letters[i] != 0)
                non_zero++;
        }

        int[] new_letters = new int[non_zero];
        int k = 0;
        for(int i = 0; i < letters.length; i++)
        {
            if(letters[i] != 0)
                new_letters[k++] = letters[i]; 
        }

        Arrays.sort(new_letters);
        boolean isdifferent = false;
       
        int j = non_zero - 1;
        for(int i = 0; i < non_zero/2; i++)
        {
            if(new_letters[j] - new_letters[i] > 1)
                return "NO";
            else if(new_letters[j] - new_letters[i] == 1)
            {
                if(isdifferent)
                    return "NO";
                isdifferent = true;
            }
            j--;
        }
        return "YES";
    }
