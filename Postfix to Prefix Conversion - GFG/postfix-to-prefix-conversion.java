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
            String ans = obj.postToPre(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String postToPre(String post_exp) {
        
        Stack<String> st = new Stack<>();
        
        for(int i=0; i<post_exp.length(); i++) {
            
            char ch = post_exp.charAt(i);
            
            //1. if ch is a letter or digit the push to stack.
            if(Character.isLetterOrDigit(ch)) st.push(ch + "");
            
            //2. if ch is a operator the pop two ele o stack and append it to a string.
            else {
                String op1 = st.pop();
                String op2 = st.pop();
                
                String res = ch + op2 + op1;
                st.push(res);
            }
        }
        return st.peek();
    }
}
