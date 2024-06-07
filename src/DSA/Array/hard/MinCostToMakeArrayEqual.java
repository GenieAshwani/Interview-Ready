package DSA.Array.hard;

public class MinCostToMakeArrayEqual {

    public static void main(String[] args) {

        int nums[]={1,3,5,2};
        int cost[]={2,3,1,14};
        long minCost = minCost(nums, cost);
        System.out.println(minCost);
    }
    public static long minCost(int[] nums, int[] cost) {

        // Initialize the search boundaries
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            left = Math.min(left, nums[i]);
            right = Math.max(right, nums[i]);
        }

        long ans = 0L;

        // Binary search for the optimal value within the range [left, right]
        while (left < right) {
            int mid = (left + right) / 2;

            // Calculate the cost for converting all elements to 'mid'
            long leftCost = getCost(nums, cost, mid);
            // Calculate the cost for converting all elements to 'mid + 1'
            long rightCost = getCost(nums, cost, mid + 1);

            // Minimum of the two costs
            ans = Math.min(leftCost, rightCost);

            // Adjust the search space based on the cost comparison
            if (leftCost > rightCost) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return ans;
    }

    private static long getCost(int[] nums, int[] cost, int base) {
        long totalCost = 0;

        // Calculate the total cost to convert all elements to 'base'
        for (int i = 0; i < nums.length; i++) {
            totalCost += (long) cost[i] * Math.abs(nums[i] - base);
        }

        return totalCost;
    }
}
