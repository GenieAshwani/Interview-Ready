package DSA.Array;

import java.util.ArrayList;

 class InversionCount {
    private static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //Modification 1: cnt variable to count the pairs:
        int cnt = 0;

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                cnt += (mid - left + 1); //Modification 2
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt; // Modification 3
    }

    private static int mergeSortAndCount(int[] arr, int low, int high) {
        int inversionCount = 0;
        if (low < high) {
            int mid = (low + high) / 2;
            inversionCount += mergeSortAndCount(arr, low, mid);
            inversionCount += mergeSortAndCount(arr, mid + 1, high);
            inversionCount += merge(arr, low, mid, high);
        }
        return inversionCount;
    }

    public static int countInversions(int[] arr) {
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 20, 6, 4, 5};
        System.out.println("Inversion Count: " + countInversions(arr));
    }
}
