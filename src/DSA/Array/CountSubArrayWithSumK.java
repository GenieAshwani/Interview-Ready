package DSA.Array;
import java.util.HashMap;
import java.util.Map;
public class CountSubArrayWithSumK {

    public static void main(String[] args) {
        int arr[]={1,1,1};
        System.out.println(subarraySum(arr,2));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1); // To handle subarrays starting from index 0

        for (int num : nums) {
            sum += num;

            // If (sum - k) exists in prefixSumFreq, it means there is a subarray whose sum equals k
            if (prefixSumFreq.containsKey(sum - k)) {
                count += prefixSumFreq.get(sum - k);
            }

            // Update the frequency of the current prefix sum
            prefixSumFreq.put(sum, prefixSumFreq.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
