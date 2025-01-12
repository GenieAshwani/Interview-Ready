package DSA.Array;

public class TrappingWater {
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};

        System.out.println(trap(arr));
    }

    public static int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int trappedWater = 0;

        left[0] = height[0];  // Base case: leftmost bar has no left
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        right[n - 1] = height[n - 1];  // Base case: rightmost bar has no
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }

        for (int i = 0; i < n; i++) {
            int minHeight = Math.min(left[i], right[i]);
            trappedWater += minHeight - height[i];
        }
        return trappedWater;
    }
}
