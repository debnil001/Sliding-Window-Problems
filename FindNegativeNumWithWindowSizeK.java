/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SlidingWindow;

/**
 *
 * @author HP
 */
//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K){
        int i=0,j=0;
        ArrayList<Long> neg=new ArrayList<>();
        long ans[]=new long[N-K+1];
        while(j<N){
            neg.add(A[j]);
            if(j-i+1<K)
                j++;
            else if((j-i+1)==K){
                if(neg.isEmpty()){
                    neg.add(A[j]);
                    ans[i]=0;
                }
                else{
                    ans[i]=neg.get(0);
                    if(A[i]==neg.get(0))
                        neg.remove(0);
                }
                i++;j++;
            }
        }
        return ans;
    }
}
public class FindNegativeNumWithWindowSizeK {
    
}
