
// The following is the solution to the problem of Balanced Brackets under the category : Stacks and Queues

public class Solution {

  
    
    static boolean pairmatch(char a, char b)
    {
        if(a == '(' && b ==')')
            return true;
        else if(a == '{' && b == '}')
            return true;
        else if(a == '[' && b == ']')
            return true;
        else
            return false;
    }

    static String isBalanced(String s) {

        Stack<Character> the_stack = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[')
            {
                the_stack.push(s.charAt(i));
            }
            
           if(s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']')
           {
               if(the_stack.empty())
               {
                   return "NO";
               }
               else if(!pairmatch(the_stack.pop(), s.charAt(i)))
               {
                   return "NO";
               }
           }
            
        }
        
        // Now, check if the stack is empty of does it still have something left ?
        
        if(the_stack.empty())
        {
            return "YES";
        }
        else
        {
            return "NO";
        }
        
        
    }
