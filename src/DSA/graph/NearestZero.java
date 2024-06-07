package DSA.graph;

import java.util.LinkedList;
import java.util.Queue;

public class NearestZero {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] updated = updateMatrix(matrix);
        for (int i = 0; i < updated.length; i++) {
            for (int j = 0; j < updated[i].length; j++) {
                System.out.print(updated[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] updateMatrix(int[][] mat) {
        //Custom Pair class for storing cell to Queue
        class Pair{
            int row;
            int col;
            Pair(int row, int col){
                this.row = row;
                this.col = col;
            }
        }

        int n = mat.length;
        int m = mat[0].length;
        Queue<Pair> queue = new LinkedList<>();
        int ans[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0){
                    queue.offer(new Pair(i, j)); // Storing cell which contains zero
                    ans[i][j] = 0;
                }
                else{
                    ans[i][j] = -1;
                }
            }
        }

        //Applying BFS
        while(!queue.isEmpty()){
            Pair temp = queue.poll();
            int row = temp.row;
            int col = temp.col;

            //If diagnal cell is valid and not visited yet then update it's distance from zero
            if(isValid(row, col+1, n, m) && ans[row][col+1] == -1){
                queue.offer(new Pair(row, col+1));
                ans[row][col+1] = ans[row][col] + 1;
            }

            if(isValid(row, col-1, n, m) && ans[row][col-1] == -1){
                queue.offer(new Pair(row, col-1));
                ans[row][col-1] = ans[row][col] + 1;
            }

            if(isValid(row+1, col, n, m) && ans[row+1][col] == -1){
                queue.offer(new Pair(row+1, col));
                ans[row+1][col] = ans[row][col] + 1;
            }

            if(isValid(row-1, col, n, m) && ans[row-1][col] == -1){
                queue.offer(new Pair(row-1, col));
                ans[row-1][col] = ans[row][col] + 1;
            }
        }
        return ans;
    }

    //Method for checing validity
    public static boolean isValid(int i, int j, int n, int m){
        if(i < 0 || i >= n || j < 0 || j >= m){
            return false;
        }
        return true;
    }

}
