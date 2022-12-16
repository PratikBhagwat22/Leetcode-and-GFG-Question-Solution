//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
    long findSqur(long x){
        long temp;
        long squareRoot = 1;
        
        // do{
        //     temp = squareRoot;
        //     squareRoot = (temp +(x/temp))/2;
        // }while((temp - squareRoot)!=0);
        while(squareRoot * squareRoot <= x)
        {
            squareRoot++;
        }
        
        return squareRoot-1;
    }
    
    
     long floorSqrt(long x)
	 {
	     if(x==0 || x==1)
	     return x;
	     
	    long ans = findSqur(x);
	    return ans;
	 }
}
