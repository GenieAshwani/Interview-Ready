package DSA.DP;

public class MaxAlterSubSeq {

    public static void main(String[] args) {
        int nums[]={4,2,5,3};
        int n = nums.length;
        // Initialize memoization table
        Long[][] memo = new Long[n][2];
        long res= solve(0, nums, true, memo);
        System.out.println(res);
    }

   static long solve(int idx, int nums[], boolean flag, Long[][] memo) {
        if (idx >= nums.length) {
            return 0;
        }
        // If the result for this subproblem is already computed, return it from memo
        if (memo[idx][flag ? 1 : 0] != null) {
            return memo[idx][flag ? 1 : 0];
        }
        long skip = solve(idx + 1, nums, flag, memo);
        long val = nums[idx];
        if (!flag) {
            val = -val;
        }
        long take = solve(idx + 1, nums, !flag, memo) + val;
        // Store the result in memo before returning
        return memo[idx][flag ? 1 : 0] = Math.max(take, skip);
    }
}
