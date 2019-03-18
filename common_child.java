static int commonChild(String s1, String s2) {
        int m = s1.length()+1;
        int[][] rec = new int[m][m];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < m; j++)
            {
                rec[i][j] = 0;
            }
        }

        // the algortithm
        for(int i = 0; i < m-1; i++)
        {
            for(int j = 0; j < m-1; j++)
            {
                if(s1.charAt(i) == s2.charAt(j))
                    rec[i+1][j+1] = rec[i][j] + 1;
                else
                    rec[i+1][j+1] =  maxfunc(rec[i+1][j], rec[i][j+1]); 
            }
        }

        return rec[m-1][m-1];
    }

    public static int maxfunc(int a, int b)
    {
        return a >= b ? a : b;
    }
