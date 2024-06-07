package DSA.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DaigonalFetch {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] diagonalOrder =findDiagonalOrder(matrix);

        System.out.println("Diagonal Order:");
        for (int num : diagonalOrder) {

            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[] findDiagonalOrder(int[][] mat) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;

        // Populate map
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.putIfAbsent(i + j, new ArrayList<>());
                map.get(i + j).add(mat[i][j]);
            }
        }

        // Flatten the diagonal entries into an array
        int[] arr = new int[m * n];
        int index = 0;
        for (int i = 0; i < m + n - 1; i++) {
            ArrayList<Integer> diagonalEntries = map.getOrDefault(i, new ArrayList<>());
            if (i % 2 == 1) {
                Collections.reverse(diagonalEntries);
            }
            for (Integer val : diagonalEntries) {
                arr[index++] = val;
            }
        }
        return arr;
    }
}

