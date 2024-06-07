package DSA.DP;

import java.util.Arrays;

class Scheduler {

    public static void main(String[] args) {
        int a[] = {6, 5, 4, 3, 2, 1};
        System.out.println(minDifficulty(a, 2));
    }

    public static int minDifficulty(int[] jd, int d) {
        int n = jd.length;
        if (n < d) return -1;

        int[][] memo = new int[n][d + 1];
        for (int[] row : memo) Arrays.fill(row, -1);

        return helper(jd, n, 0, d, memo);
    }

    static int helper(int[] jd, int n, int idx, int d, int[][] memo) {

        if (d == 1) {
            int maxD = 0;
            for (int i = idx; i < n; i++) {
                maxD = Math.max(maxD, jd[i]);
            }

        }

        int maxD = 0;
        int finalRes = Integer.MAX_VALUE;

        for (int i = idx; i <= n - d; i++) {
            maxD = Math.max(maxD, jd[i]);
            int res = maxD + helper(jd, n, i + 1, d - 1, memo);
            finalRes = Math.min(finalRes, res);
        }

        return finalRes;
    }
}
