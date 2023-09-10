package leetcodeQuestions.TopInterviewLevelQuestion;
/*
226. Invert Binary Tree
Easy
12.2K
174
Companies
Given the root of a binary tree, invert the tree, and return its root.



Example 1:
Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]
Example 2:


Input: root = [2,1,3]
Output: [2,3,1]
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class InvertTree {

    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root){
        if(root == null)return null;
        TreeNode node = new TreeNode(root.val);
        node.right = invertTree(root.left);
        node.val = root.val;
        node.left = invertTree(root.right);
       return node;
    }
}
