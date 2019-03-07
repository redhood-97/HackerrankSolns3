
/* Solution to Hackerrank problem 'Abbreivation' */

static String abbreviation(String a, String b) {
        int[] bla = new int[91];
        int[] blb = new int[91];
        int[] sla = new int[128];
        int[] slb = new int[128];

        /* 'bla' stands for big letters in a....& sla for small letters in a  */

        for(int i = 0;i < a.length(); i++)
        {
            int temp = a. charAt(i);
            if(temp >= 65 && temp <= 90)
                bla[temp]++;
            else if(temp >= 97 && temp <=122)
                sla[temp]++;
        }
        /* String b has all uppercase characters */
        for(int i = 0; i < b.length(); i++)
            blb[b.charAt(i)]++;

        /* checking the difference between the two BIG letter arrays */

        for(int i = 0; i < bla.length; i++)
        {
            if(bla[i] != blb[i])
            {
                if(bla[i] > blb[i])
                    return "NO";
                else
                    slb[i + 32] += blb[i] - bla[i];
            }
        }

        /* Now, finally, comparing the no of remaining SMALL letters in both arrays */

        for(int i = 0; i < sla.length; i++)
        {
            if(sla[i] != slb[i])
                if(slb[i] > sla[i])
                    return "NO";
        }

        return "YES";

    }
