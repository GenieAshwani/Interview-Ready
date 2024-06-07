package DSA.BinaryTree;

import java.util.*;

// Definition for a binary tree node.
class Node {
    int val;
    Node left;
    Node right;

    Node(int x) {
        val = x;
    }
}

 public class LevelOrder {

     public static List<Integer> spiralLevelOrder(Node root) {
         List<Integer> result = new ArrayList<>();
         if (root == null) return result;

         Queue<Node> queue = new LinkedList<>();
         queue.offer(root);
         boolean leftToRight = false;

         while (!queue.isEmpty()) {
             int size = queue.size();
             List<Integer> level = new ArrayList<>();

             for (int i = 0; i < size; i++) {
                 Node current = queue.poll();
                 if (leftToRight) {
                     level.add(current.val);
                 } else {
                     level.add(0,current.val); // Insert at the beginning for right-to-left
                 }

                 if (current.left != null) queue.offer(current.left);
                 if (current.right != null) queue.offer(current.right);
             }

             result.addAll(level);
             leftToRight = !leftToRight; // Toggle direction for next level
         }

         return result;
     }


     public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 / \ / \
                6  7 4  5
        */
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(7);
         root.left.right = new Node(6);
         root.right.left = new Node(5);
         root.right.right = new Node(4);

         List<Integer> spiralOrder = spiralLevelOrder(root);
         System.out.println(spiralOrder);
     }
 }