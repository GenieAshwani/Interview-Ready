package DSA.Array;

import java.util.HashMap;
import java.util.Map;

public class SubArrayEqualK {
    public static void main(String[] args) {
        int arr[]={1,1,1};
        System.out.println(subarraySum(arr,2));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        // Initialize the map with sum = 0 and index -1
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }

            // Update the map if sum is not already present
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
