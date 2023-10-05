package binaryTree;

public class BinaryTree {

    /**
     * Print BT using Inorder traversal (left - right - root)
     *
     * @param root
     * @param level
     */
    public static void inOrderTraversal(TreeNode root, int level) {

        if (root != null) {
            inOrderTraversal(root.leftChild, level + 1);
            System.out.println("Level " + level + ": " + root.data);
            inOrderTraversal(root.rightChild, level + 1);
        }
    }

    /**
     * Print BT using Preorder traversal (left - right - root)
     *
     * @param root
     * @param level
     */
    public static void preOrderTraversal(TreeNode root, int level) {

        if (root != null) {
            System.out.println("Level " + level + ": " + root.data);
            preOrderTraversal(root.leftChild, level + 1);
            preOrderTraversal(root.rightChild, level + 1);
        }
    }

    /**
     * Print BT using Postorder traversal (left - right - root)
     *
     * @param root
     * @param level
     */
    public static void postOrderTraversal(TreeNode root, int level) {

        if (root != null) {
            postOrderTraversal(root.leftChild, level + 1);
            postOrderTraversal(root.rightChild, level + 1);
            System.out.println("Level " + level + ": " + root.data);
        }
    }

}
