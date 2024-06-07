package DSA.Array;

public class LeftSmallRightBig {
    public static void main(String[] args) {
        int arr[]={4, 2, 5, 7};
        System.out.println(findElement(arr,arr.length));
    }

    public static int findElement(int arr[],int n)
    {
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];

        // Initialize leftMax array
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i - 1]);
        }

        // Initialize rightMin array
        rightMin[n - 1] = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMin[i] = Math.min(rightMin[i + 1], arr[i + 1]);
        }

        // Find the element
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= leftMax[i] && arr[i] <= rightMin[i]) {
                return arr[i];
            }
        }

        // If no such element found
        return -1;
    }
}
