
// Solved in O(n) time complexity

public class Solution {

   
    static String twoStrings(String s1, String s2) {

        String neg = "NO";
        
        String pos = "YES";
        
        boolean v[] = new boolean[s1.length() + s2.length()];
        
        Arrays.fill(v, false);
        
        for(int i = 0; i < s1.length(); i++)
        {
            v[s1.charAt(i) - 'a'] = true;
        }
        
        for(int i = 0; i < s2.length(); i++)
        {
            if(v[s2.charAt(i) - 'a'])
            {
                return pos;
            }
        }
        
        return neg;
        
        
    }