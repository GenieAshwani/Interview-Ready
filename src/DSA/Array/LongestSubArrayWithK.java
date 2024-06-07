package DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithK {

    public static void main(String[] args) {
        int arr[]={3,1,2,1,1,2};

       int res= longestSubarraySumK(arr,5);
        System.out.println(res);
    }

    public static int longestSubarraySumK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLen = i + 1; // Subarray from index 0 to i has sum k
            } else if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
