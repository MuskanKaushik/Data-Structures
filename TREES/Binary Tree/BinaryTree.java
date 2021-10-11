import java.util.*;

public class BinaryTree{
    private Node root;

    private class Node{
        private Node left;
        private Node right;
        private int data;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public void createBinaryTree()
    {
        Node first = new Node(9);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        root = first;
        first.left = second;
        first.right = third;

        second.left = fourth;
    }

    public void preOrder(Node root)
    {
        if(root == null)
        {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrder(bt.root);
    }
}