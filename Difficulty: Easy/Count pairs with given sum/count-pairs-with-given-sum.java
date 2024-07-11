//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            int k = Integer.parseInt(read.readLine().trim());
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution obj = new Solution();
            int ans = obj.getPairsCount(nums, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int getPairsCount(int[] arr, int sum) {
        // code here
           // code here
        HashMap<Integer,Integer>h=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(h.containsKey(sum-arr[i]))
            {
                count+=h.get(sum-arr[i]);
            }
            h.put(arr[i],h.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
}
