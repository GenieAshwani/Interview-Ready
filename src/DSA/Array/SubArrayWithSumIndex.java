package DSA.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class SubArrayWithSumIndex {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        ArrayList<Integer> res=subarraySum1(arr,arr.length,0);
        System.out.println(res);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int maxLen=0;
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<arr.length;j++)
            {
                sum+=arr[j];
                if(sum==s)
                {
                    res.add(i+1);
                    res.add(j+1);
                    return res;
                }
                if(sum>s) break;
            }
        }
        return null;
    }

    static ArrayList<Integer> subarraySum1(int[] arr, int n, int s) {
        int sum = 0, i = 0, j = 0;
        // Your code here
        ArrayList<Integer> subarr = new ArrayList<>();
        for (i = 0; i < n; i++) {
            sum += arr[i];
            while (j < n && sum > s) {
                sum -= arr[j];
                j++;

            }
            if (sum == s && i >= j) {
                subarr.add(j + 1);
                subarr.add(i + 1);
                break;
            }
        }

        if (subarr.size() == 0 ) {
            subarr.clear();
            subarr.add(-1);
        }
        return subarr;
    }
}
