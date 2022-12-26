//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends



class Solution
{
    
    public static int[] prevGreEleIdx(int[] arr) {
        
        Stack<Integer> st = new Stack<>();
        
        int ans[] = new int[arr.length];
        
        for(int i= arr.length-1; i>=0; i--) {
            
            while(st.size() > 0 && arr[i] > arr[st.peek()]) {
                
                // here iam storing indexes of the prevGreEle in our ans.
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(st.size() > 0) {
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;
    }   
    
    
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        //1. find the previous greater elements idx for the array.
            int[] temp = prevGreEleIdx(price);
            
            int[] ans = new int[n];
            
            for(int i=0; i<n; i++) {
                
                int breakPoint = temp[i];
                
                ans[i] = i - breakPoint;
            }
            return ans;
    }
    
}