package DSA.Array;

import java.util.Arrays;
import java.util.Comparator;

public class LongestNumber {

    public static void main(String[] args) {
            int arr[]={3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }

    public static String largestNumber(int[] nums) {
        Integer[] a = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[i];
        }
        Arrays.sort(a, new NumberComparator());
        StringBuilder sb = new StringBuilder();
        for (int x : a) {
            sb.append(x);
        }
        String result = sb.toString();
        // Remove leading zeros
        int i = 0;
        while (i < result.length() - 1 && result.charAt(i) == '0') {
            i++;
        }
        return result.substring(i);
    }

    static class NumberComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            String ab = a + "" + b;
            String ba = b + "" + a;
            return ba.compareTo(ab);
        }
    }
}
