//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.postToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToInfix(String str) {
        
        Stack<String> st = new Stack<>();
        
        for(int i=0; i<str.length(); i++) {
            
            char ch = str.charAt(i);
            
            //1. if ch is a letter or alphabet then push to stack.
            if(Character.isLetterOrDigit(ch)) st.push(ch + "");
            
            //2.else the ch is an operator then pop two ele from stack and append it to a string with the operator.
            else {
                String op1 = st.pop();
                String op2 = st.pop();
                String result = "(" + op2 + ch + op1 + ")";
                st.push(result);
            }
    
        }
        
        return st.peek();
    }
}
