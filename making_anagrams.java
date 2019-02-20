static int makeAnagram(String a, String b) {
        
        int[] letters_a = new int[128];  
        int[] letters_b = new int[128];
        // The character set given ==> [a-z]

        for(char c : a.toCharArray())
        {
            int x = (int)c;
            letters_a[x]++;  // increase the cell count with one
        }

        for(char c : b.toCharArray())
        {
            int x = (int)c;
            letters_b[x]++;
        }

        int counter = 0;
        for(int i = 0; i < 128; i++)
        {
            if(Math.abs(letters_a[i] - letters_b[i]) > 0)
                counter = counter + Math.abs(letters_a[i] - letters_b[i]);
        }

        return counter;

    }
