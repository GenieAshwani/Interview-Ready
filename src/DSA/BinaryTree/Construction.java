package DSA.BinaryTree;


import java.util.HashMap;

class TreeNode {
      int val;
    Node left;
      Node right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, Node left, Node right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Construction {
    int preIdx; // Index for preorder traversal
    public Node buildTree(int[] preorder, int[] inorder) {
        // HashMap to store indices of elements in inorder traversal
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        preIdx = 0; // Initialize preIdx

        return buildTree(preorder, inorder, 0, inorder.length - 1, indexMap);
    }

    private Node buildTree(int[] preorder, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> indexMap) {
        if (inStart > inEnd) {
            return null;
        }

        int rootVal = preorder[preIdx++];
        Node root = new Node(rootVal);

        int inIdx = indexMap.get(rootVal); // Index of rootVal in inorder traversal

        // Recursively build left and right subtrees
        root.left = buildTree(preorder, inorder, inStart, inIdx - 1, indexMap);
        root.right = buildTree(preorder, inorder, inIdx + 1, inEnd, indexMap);

        return root;
    }
}
