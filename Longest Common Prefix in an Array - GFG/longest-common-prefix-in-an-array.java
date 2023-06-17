//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
         int l=1005 ;
        int flag=1;
        String s="";
        for(int i=0;i<n;i++){
            l=Math.min(l,arr[i].length());
        }
        for(int i=0;i<l;i++){
            char ch=arr[0].charAt(i);
            for(int j=1;j<n;j++){
                if(arr[j].charAt(i)!=ch)
                flag=0;
            }
            if(flag==1)
            s=s+ch;
            else
            break;
        }
        if(s.length()==0)
        return "-1";
        return s;
    }
}