package binaryTree;

public class TreeNode {

    public String data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "<<Binary Tree info>>\nData: " + data;
    }
}
