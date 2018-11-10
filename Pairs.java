
// Pairs done in O(n) time complexity

public class Solution {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
        
        int counter = 0;
        
        Map<Integer, Integer> hmap = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++)
        {
            hmap.put(arr[i], i);  // The arr[i] is the key here, i being the value
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if(hmap.containsKey(k + arr[i]))  
            {
                counter++;
            }
        }
        
        return counter;
    
    }
