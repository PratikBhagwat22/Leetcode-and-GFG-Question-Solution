//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            new Solution().segregate0and1(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    
    void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    void segregate0and1(int[] arr, int n) {
        
       // we can have three areas
       //1.{0,i-1} ---> which contains 0s to the left side of array.
       //2.{i,j} ---> this area is undiscovered.
       //3.{j+1,n-1} ---> which contains 1s to the right side of array.
       
       
       int i=0;
       int j= n-1;
       
       while(i<=j)
       {
           if(arr[i]==1)
           {
               swap(arr,i,j);
               j--;
           }
           else
           {
               i++;
           }
       }
    }

}