package DSA.Array;

class MergeArrays {
    public static void mergeArrays(int[] arr1, int[] arr2, int n, int m) {
        int i = n - 1;  // Index for arr1
        int j = m - 1;  // Index for arr2
        int k = n + m - 1;  // Index for merged array (arr1)

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                arr1[k] = arr1[i];
                i--;
            } else {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in arr2
        while (j >= 0) {
            arr1[k] = arr2[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr1 = {1, 3, 5, 7};
        int m = 5;
        int[] arr2 = {0, 2, 6, 8, 9};

        // Ensure arr1 has enough space for merged elements
        int[] mergedArr = new int[n + m];
        System.arraycopy(arr1, 0, mergedArr, 0, n);

        mergeArrays(mergedArr, arr2, n, m);

        // Modify arr1 and arr2
        for (int idx = 0; idx < n; idx++) {
            arr1[idx] = mergedArr[idx];
        }
        for (int idx = 0; idx < m; idx++) {
            arr2[idx] = mergedArr[n + idx];
        }

        System.out.print("Modified arr1: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Modified arr2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
