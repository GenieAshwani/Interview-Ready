package DSA.Array;

import java.util.Arrays;
import java.util.HashSet;

public class TripletsCount {
    public static void main(String[] args) {
        int arr[]={12, 8 ,2 ,11, 5, 14 ,10};
        System.out.println(count(arr,arr.length));
    }

    public static int count(int arr[],int n)
    {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum_val = arr[i] + arr[j];
                if (set.contains(sum_val)) {
                    count++;
                }
            }
        }

        return count;
    }
}
