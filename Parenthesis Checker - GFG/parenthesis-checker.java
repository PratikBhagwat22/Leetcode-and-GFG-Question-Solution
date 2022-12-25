//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        //Reading total number of testcases
        int t= sc.nextInt();
        
        while(t-- >0)
        {
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
    }
}
// } Driver Code Ends




class Solution
{
    static char oppChar(char ch) {
        if(ch == ')') return '(';
       else if(ch == '}') return '{';
        else return '[';
    }
    
    
    //Function to check if brackets are balanced or not.
    static boolean ispar(String str)
    {
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<str.length(); i++) {
            
            char ch = str.charAt(i);
            
            //1. if ch is not an opening bracket then until we get an closing bracket push it to stack
            
            if(ch == '(' || ch == '{' || ch == '[')
            
                st.push(ch);
            
            
            //2. if our ch is a closing bracket then check if our peek is opposite bracket or not if yes then pop.
            
            else if(ch == ')' || ch == '}' || ch == ']')
                {
                    if(st.size() > 0 && st.peek() == oppChar(ch))
                        st.pop();
                    
                    else return false;
                }
        }
        if(st.size() > 0) return false;
        return true;
    }
}
