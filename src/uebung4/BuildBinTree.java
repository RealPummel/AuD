package uebung4;

import aud.BinaryTree;
import aud.util.DotViewer;
import aud.Queue;

public class BuildBinTree {

    public void preorderTraverse(BinaryTree<Integer> tree) {
        if (tree == null) {
            return;
        }
        System.out.println(tree.getData());
        preorderTraverse(tree.getLeft());
        preorderTraverse(tree.getRight());
    }

    public void inorderTraverse(BinaryTree<Integer> tree) {
        if (tree == null) {
            return;
        }
        inorderTraverse(tree.getLeft());
        System.out.println(tree.getData());
        inorderTraverse(tree.getRight());
    }

    public void postorderTraverse(BinaryTree<Integer> tree) {
        if (tree == null) {
            return;
        }
        postorderTraverse(tree.getLeft());
        postorderTraverse(tree.getRight());
        System.out.println(tree.getData());
    }

    public void levelorderTraverse(BinaryTree<Integer> tree) {
        if (tree == null) {
            return;
        }

        Queue<BinaryTree<Integer>> queue = new Queue<>();
        queue.enqueue(tree);

        while (!queue.is_empty()) {
            BinaryTree<Integer> node = queue.dequeue();
            System.out.println(node.getData());
            if (node.getLeft() != null) {
                queue.enqueue(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.enqueue(node.getRight());
            }
        }
    }

    public static BinaryTree<Integer> buildTree() {
        BinaryTree<Integer> tree = new BinaryTree<>(1);
        tree.setLeft(new BinaryTree<>(2));
        tree.setRight(new BinaryTree<>(3));
        tree.getLeft().setLeft(new BinaryTree<>(4));
        tree.getLeft().setRight(new BinaryTree<>(5));
        tree.getRight().setLeft(new BinaryTree<>(6));
        tree.getRight().setRight(new BinaryTree<>(7));
        return tree;
    }

    public static void main(String[] args) {
        // TODO: implement a class to visualise the binary tree
        BinaryTree<Integer> tree = buildTree();

        DotViewer.displayWindow(tree,"Tree").setExitOnClose();

        BuildBinTree bbt = new BuildBinTree();
        System.out.println("Preorder Traversal");
        bbt.preorderTraverse(tree);

        System.out.println("Inorder Traversal");
        bbt.inorderTraverse(tree);

        System.out.println("Postorder Traversal");
        bbt.postorderTraverse(tree);

        System.out.println("Levelorder Traversal");
        bbt.levelorderTraverse(tree);

    }
}
