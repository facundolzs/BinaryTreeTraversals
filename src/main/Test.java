package main;

import binaryTree.TreeNode;

public class Test {

    public static void main(String[] args) {

        TreeNode root = new TreeNode("Information");

        // Left branch:
        root.leftChild = new TreeNode("Payments");
        root.leftChild.leftChild = new TreeNode("Bills.txt");
        root.leftChild.leftChild.leftChild = new TreeNode("Taxes.txt");
        root.leftChild.leftChild.rightChild = new TreeNode("Rent.txt");

        // Right branch:
        root.rightChild = new TreeNode("Dates");
        root.rightChild.leftChild = new TreeNode("Meetings.txt");
        root.rightChild.rightChild = new TreeNode("Personal");
        root.rightChild.rightChild.leftChild = new TreeNode("Bday.txt");
        root.rightChild.rightChild.rightChild = new TreeNode("Vacations.txt");

        binaryTree.BinaryTree.preOrderTraversal(root, 0);

    }

}
