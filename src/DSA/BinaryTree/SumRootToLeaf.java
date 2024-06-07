package DSA.BinaryTree;

import java.util.ArrayList;

public class SumRootToLeaf {

   static ArrayList<Integer> res=new ArrayList<>();
    public static void main(String[] args) {
        TreeNode1 root=new TreeNode1(1);
        root.left=new TreeNode1(2);
        root.right=new TreeNode1(2);
        root.left.left=new TreeNode1(3);
        root.left.right=new TreeNode1(4);
        root.right.right=new TreeNode1(3);
        int numbers = sumNumbers(root);
        System.out.println(numbers);
        System.out.println(calculateSum(root,0));
    }
    public static int sumNumbers(TreeNode1 root) {

        solve(root,0);
        int ans=0;
        for(Integer a:res)
        {
            ans+=a;
        }
        return ans;
    }

    public static void solve(TreeNode1 root,int sum)
    {
        if(root==null) return;
        if(root.left==null&&root.right==null)
        {
            sum+=root.val;
            res.add(sum);
        }
        sum=sum*10+root.val*10;
        solve(root.left,sum);
        solve(root.right,sum);
        return;
    }

    private static int calculateSum(TreeNode1 node, int currentSum) {
        if (node == null) {
            return 0;
        }

        currentSum = currentSum * 10 + node.val;

        if (node.left == null && node.right == null) {
            return currentSum;
        }

        return calculateSum(node.left, currentSum) + calculateSum(node.right, currentSum);
    }
}
