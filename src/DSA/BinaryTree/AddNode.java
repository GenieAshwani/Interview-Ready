package DSA.BinaryTree;

public class AddNode {
    public static void main(String[] args) {

        
    }
    static TreeNode1 solve(TreeNode1 root,int val,int depth,int count)
    {
        if(root==null) return null;
        if(count==1)
        {
            TreeNode1 node=new TreeNode1(val);
            node.left=root;
            return root;
        }

        count++;
        if(count==depth-1)
        {
            TreeNode1 tmpL=root.left;
            TreeNode1 tmpR=root.right;
            root.left=new TreeNode1(val);
            root.right=new TreeNode1(val);
            root.left.left=tmpL;
            root.right.right=tmpR;
            return root;
        }

        if(root.left!=null) solve(root.left,val,depth,count);
        if(root.right!=null) solve(root.right,val,depth,count);

        return root;
    }
}
