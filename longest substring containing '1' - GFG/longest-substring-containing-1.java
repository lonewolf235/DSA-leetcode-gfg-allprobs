//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String s=br.readLine();
		    GfG g=new GfG();
		    int len=g.count(s);
		    System.out.println(len);
		}
	}
}

// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public int count(String s)
    {
    int l=s.length();
    int max=0;
    int temp=0;
    for(int i=0;i<l;i++){
        char c=s.charAt(i);
        if(c=='1'){
            temp++;
            max=Math.max(max,temp);
        }
        else
        temp=0;
    }
    return max;
    }
}