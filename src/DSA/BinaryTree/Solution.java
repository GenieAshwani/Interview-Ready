package DSA.BinaryTree;

// Definition for a binary tree node.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        // Construct the tree from the input array

        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.left = new TreeNode1(4);//1-2-4
        root.right.left = new TreeNode1(2);//-
        root.right.left.left = new TreeNode1(4);
        root.right.right = new TreeNode1(4);


        List<TreeNode1> duplicateSubtrees = findDuplicateSubtrees(root);
       for(TreeNode1 treeNode1:duplicateSubtrees)
       {
           System.out.println();
       }

    }
    public static List<TreeNode1> findDuplicateSubtrees(TreeNode1 root) {
        Map<String, Integer> map = new HashMap<>();
        List<TreeNode1> res = new ArrayList<>();

        getSubString(root, map, res);
        return res;
    }

     static String  getSubString(TreeNode1 root, Map<String, Integer> map, List<TreeNode1> res) {
        if (root == null) {
            return "N";
        }
        String s = root.val + "," + getSubString(root.left, map, res) + "," + getSubString(root.right, map, res);
        map.put(s, map.getOrDefault(s, 0) + 1);
        if (map.get(s) == 2) {
            res.add(root);
        }
        return s;
    }


}
class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1() {}
    TreeNode1(int val) { this.val = val; }
    TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
