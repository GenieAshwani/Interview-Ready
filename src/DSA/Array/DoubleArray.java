package DSA.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DoubleArray {
    public static void main(String[] args) {
        int arr[] = {2, 6, 4, 4, 1, 3, 8, 8};
        int result[] = findOriginalArray(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findOriginalArray(int[] changed) {
        Map<Integer, Integer> map = new HashMap<>();

        int n = changed.length;

        // Odd length
        if (n % 2 != 0) {
            return new int[]{};
        }

        // Initialize the result array with double the length of the input array
        int[] res = new int[n];

        Arrays.sort(changed);

        for (int d : changed) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }

        int index = 0; // Index for result array

        for (int j : changed) {
            int twice = j * 2;
            if (map.getOrDefault(twice, 0) == 0) {
                continue; // Skip processing if count is 0
            }
            if (map.containsKey(twice) && map.get(twice) > 0) {
                res[index++] = j;
                res[index++] = twice;
                map.put(twice, map.get(twice) - 1);
                map.put(j, map.get(j) - 1);
            } else {
                return new int[]{};
            }
        }

        // Trim the result array to remove unused slots
        return Arrays.copyOfRange(res, 0, index);
    }
}
