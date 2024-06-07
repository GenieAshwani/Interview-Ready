package DSA.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxLevelSum {
    public static void main(String[] args) {

        TreeNode1 root=new TreeNode1(1);
        root.left=new TreeNode1(7);
        root.right=new TreeNode1(0);
        root.left.left=new TreeNode1(7);
        root.left.right=new TreeNode1(-8);
        System.out.println(maxLevelSum(root));

    }
    public static int maxLevelSum(TreeNode1 root) {


        Queue<TreeNode1> q=new LinkedList<>();
        q.add(root);
        int level=1;
        int prev=root.val;
        int i=-1;
        while(!q.isEmpty())
        {
            int sum=0;
            int n=q.size();
            for(int k=0;k<n;k++)
            {
                TreeNode1 node=q.poll();
                sum+=node.val;

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
           if(sum>prev)
           {
               prev=sum;
               i=level;
           }
           level++;
        }

        return i;
    }
}
