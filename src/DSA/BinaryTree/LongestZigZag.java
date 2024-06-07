package DSA.BinaryTree;

public class LongestZigZag {

    static int maxLen=0;
    public static void main(String[] args) {
        TreeNode1 node8 = new TreeNode1(8);
        TreeNode1 node6 = new TreeNode1(6, node8, null);
        TreeNode1 node4 = new TreeNode1(4, node6, null);
        TreeNode1 node2 = new TreeNode1(2, null, node4);

        TreeNode1 node9 = new TreeNode1(9);
        TreeNode1 node7 = new TreeNode1(7, null, node9);
        TreeNode1 node5 = new TreeNode1(5, null, node7);
        TreeNode1 node3 = new TreeNode1(3, null, node5);

        TreeNode1 root = new TreeNode1(1, node2, node3);

        // Instantiate Solution class and find longest ZigZag path
        Solution solution = new Solution();
        int result = longestZigZag(root);
        System.out.println(result);
    }

    public static int longestZigZag(TreeNode1 node)
    {
        if(node==null) return 0;
         dfs(node.left,true,1);
         dfs(node.left,false,1);
         return  maxLen;
    }

    public static void dfs(TreeNode1 node, boolean isLeft,int len)
    {
        if(node==null) return;
        maxLen=Math.max(maxLen,len);

        if(isLeft)
        {
            dfs(node.right,false,len+1);
            dfs(node.left,true,1);
        }
        else{
            dfs(node.left,true,len+1);
            dfs(node.right,false,1);
        }
    }
}
