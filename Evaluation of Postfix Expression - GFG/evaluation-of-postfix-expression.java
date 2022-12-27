//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String str)
    {
        Stack<Integer>st = new Stack<>();
        
        for(int i=0; i<str.length(); i++) {
            
            char ch = str.charAt(i);
            
            //1. if our ch is a number then push to stack.
            if(Character.isDigit(ch)) st.push(ch - '0');
            
            //2. if the ch is a operator then pop two elements from stack and do the evaluation based on the operator
            else {
                int oper1 = st.pop();
                int oper2 = st.pop();
                
                if(ch == '+') st.push(oper2 + oper1);
                else if(ch == '*') st.push(oper2 * oper1);
                else if(ch == '/') st.push(oper2 / oper1);
                else if(ch == '-') st.push(oper2 - oper1);
            }
        
        }
        return st.peek();
    }
}