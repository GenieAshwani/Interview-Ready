package DSA.String;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.*;

public class LongestRepeatingSubSequence {
    public static int longestRepeatingSubsequence(String s) {
        int maxRepeatingLength = 0;
        List<String> subsequences = generateSubsequencesRec(s);

        // Check for repeating subsequences and update maxRepeatingLength
        for (String subsequence : subsequences) {
            if (isRepeating(subsequence, s)) {
                maxRepeatingLength = Math.max(maxRepeatingLength, subsequence.length());
            }
        }

        return maxRepeatingLength;
    }

    public static List<String> generateSubsequencesRec(String s) {
        List<String> result = new ArrayList<>();
        generateSubsequencesHelper(s, "", 0, result);
        return result;
    }

    public static void generateSubsequencesHelper(String s, String current, int index, List<String> result) {
        if (index == s.length()) {
            if (!current.isEmpty()) {
                result.add(current);
            }
            return;
        }
        generateSubsequencesHelper(s, current, index + 1, result);
        generateSubsequencesHelper(s, current + s.charAt(index), index + 1, result);
    }

    public static boolean isRepeating(String subsequence, String s) {
        int count = 0;
        int index = 0;
        while ((index = s.indexOf(subsequence, index)) != -1) {
            index += subsequence.length();
            count++;
            if (count > 1) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String s = "axxzxy";
        System.out.println(longestRepeatingSubsequence(s)); // Output should be 2
    }
}
