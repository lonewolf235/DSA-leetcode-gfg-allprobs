//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ob.printPattern(N);
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static void printPattern(int N){
        int count=0;
      for(int i=1;i<=N;){
          System.out.print("*");
          count++;
          if(count==i){
              i++;
              System.out.print(" ");
              count=0;
          }
      }
    }
}