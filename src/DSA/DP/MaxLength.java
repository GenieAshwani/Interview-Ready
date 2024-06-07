package DSA.DP;

import java.util.*;

public class MaxLength {
    public static void main(String[] args) {
        List<String> arr = Arrays.asList("un", "iq", "ue");
        System.out.println(maxLength(arr)); // Output: 4
    }

    public static int maxLength(List<String> arr) {
        return backtrack(arr, 0, "");
    }

    private static int backtrack(List<String> arr, int start, String current) {
        if (!isUnique(current)) {
            return 0;
        }
        int maxLength = current.length();
        for (int i = start; i < arr.size(); i++) {
            maxLength = Math.max(maxLength, backtrack(arr, i + 1, current + arr.get(i)));
        }
        return maxLength;
    }

    private static boolean isUnique(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                return false;
            }
        }
        return true;
    }
}
