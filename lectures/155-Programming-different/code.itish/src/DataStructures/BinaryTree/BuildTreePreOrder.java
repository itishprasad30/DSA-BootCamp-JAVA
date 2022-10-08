package DataStructures.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTreePreOrder {
    static class Node {
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
            static int idx =-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx]==-1)
                return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void levelOrder(Node root){
        if(root==null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode== null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }

            }else {
                System.out.print(currNode.data+" ");
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                    q.add(currNode.right);
            }
        }

    }
    public static void preOrder(Node root) {
        if(root==null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void inOrder(Node root){
        if (root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }
    public  static void  postOrder(Node root){
        if (root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

    // count of the nodes
    public static int countNode(Node root){
        if(root==null)
            return 0;
        int leftNodes = countNode(root.left);
        int rightNodes = countNode(root.right);
        return leftNodes+rightNodes+1;
    }

    // sum of the nodes
    public static int sumOfNode(Node root){
        if(root==null)
            return 0;
        int leftSum = sumOfNode(root.left);
        int rightSum = sumOfNode(root.right);
        return leftSum+rightSum + root.data;
    }

    public static int heightOfTree(Node root){
        if (root == null)
            return 0;
        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);
        int myHeight = Math.max(leftHeight,rightHeight)+1;
        return myHeight;

    }

    public static void main(String[] args) {
        int []nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);
//        preOrder(root);
//        inOrder(root);
//        postOrder(root);

//        levelOrder(root);
        System.out.println("Count the nodes ");
        System.out.println(countNode(root)); // 6
        System.out.println("SUm of the nodes : ");
        System.out.println(sumOfNode(root));
        System.out.println("Height of the tree :");
        System.out.println(heightOfTree(root));




    }


}
