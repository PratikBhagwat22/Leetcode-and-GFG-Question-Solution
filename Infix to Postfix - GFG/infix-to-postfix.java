//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    
    private static int prece(char ch) {
        if(ch == '*' || ch == '/') return 2;
        else if(ch == '^') return 3;
        else if(ch == '+' || ch == '-') return 1;
        else return -1;
    }
    
    
    
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        
        Stack<Character> st = new Stack<>();
        
        String result = "";
        
        for(int i=0; i<exp.length(); i++) {
            
            char ch = exp.charAt(i);
            
            //1. if ch is an opening bracket then push to stack.
            if(ch == '(') st.push(ch);
            
            //2. else if ch is an number or letter then add it to an op string.
            else if(Character.isLetterOrDigit(ch)) result += ch;
            
            //3. ch is an closing bracket pop the element until opening bracket is encountered.
            else if(ch == ')'){
                while(st.size() > 0 && st.peek() != '(') {
                    result += st.pop();
                }
                 st.pop();
            }
            //4. else if ch is an operator then check precedence.
            else {
                        while(st.size() > 0 && prece(ch) <= prece(st.peek()))
                        {
                            result += st.pop();
                        }
                        st.push(ch);
                  }
               
            }
            if(st.size() > 0) return result += st.peek();
           else return result;
        }
}