package uebung5;

import aud.*;               //to use BinaryTree<T>
import aud.util.DotViewer;

public class IntBinTree extends BinaryTree<Integer> {
    //---------------------------------------------------------------//
    public IntBinTree(int data) {
        super(data);
    }

    //---------------------------------------------------------------//
    public IntBinTree(int data, IntBinTree left, IntBinTree right) {
        super(data, left, right);
    }

    //---------------------------------------------------------------//
    public int height(BinaryTree<Integer> tree) {
        // TODO: implement to return the height of the current (sub-)tree

        if (tree == null) {
            return 0;
        } else {
            int leftHeight = height(tree.getLeft());
            int rightHeight = height(tree.getRight());

            if (leftHeight > rightHeight) {
                return leftHeight + 1;
            } else {
                return rightHeight + 1;
            }
        }
    }

    public int height() {
        return height(this);
    }

    //---------------------------------------------------------------//
    public int maxSum(BinaryTree<Integer> tree) {
        // Todo: traverse over left subtree and add the data of each node

        if (tree == null) {
            return 0;
        } else {

            BinaryTree<Integer> leftSubtree = this.getLeft();

            BinaryTree<Integer> rightSubtree = this.getRight();

            int leftSum = traverseSubtree(leftSubtree);

            int rightSum = traverseSubtree(rightSubtree);

            return Math.max(leftSum, rightSum);
        }
    }

    public static int traverseSubtree(BinaryTree<Integer> subtree) {
        if (subtree == null) {
            return 0;
        }
        int sum = 0;
        sum += traverseSubtree(subtree.getLeft());
        sum += subtree.getData();
        sum += traverseSubtree(subtree.getRight());

        return sum;
    }

    public int maxSum() {
        return maxSum(this);
    }


    //---------------------------------------------------------------//
    int maxSum = Integer.MIN_VALUE;

    public int maxPath(BinaryTree<Integer> tree) {
        if (tree == null) {
            return 0;
        }

        int leftMaxPath = Math.max(0, maxPath(tree.getLeft()));
        int rightMaxPath = Math.max(0, maxPath(tree.getRight()));

        int currentMaxPath = Math.max(tree.getData(), tree.getData() + Math.max(leftMaxPath, rightMaxPath));

        int maxPathThroughCurrent = Math.max(currentMaxPath, tree.getData() + leftMaxPath + rightMaxPath);

        maxSum = Math.max(maxSum, maxPathThroughCurrent);

        return currentMaxPath;
    }

    public int maxPath() {
        return maxPath(this);
    }

    //---------------------------------------------------------------//
    public static void main(String[] args) {
        // TODO: test your code with appropriate examples

        IntBinTree tree = new IntBinTree(1);
        tree.setLeft(new IntBinTree(39));
        tree.setRight(new IntBinTree(19));
        tree.getLeft().setLeft(new IntBinTree(59));
        tree.getLeft().setRight(new IntBinTree(6));
        tree.getRight().setLeft(new IntBinTree(-25));
        tree.getRight().setRight(new IntBinTree(14));
        tree.getRight().getRight().setRight(new IntBinTree(99));
        tree.getLeft().getLeft().setLeft(new IntBinTree(10));
        tree.getLeft().getLeft().setRight(new IntBinTree(11));
        tree.getLeft().getRight().setLeft(new IntBinTree(12));
        tree.getLeft().getRight().setRight(new IntBinTree(13));
        tree.getLeft().getRight().getRight().setLeft(new IntBinTree(14));
        tree.getLeft().getRight().getRight().setRight(new IntBinTree(15));
        tree.getRight().getLeft().setLeft(new IntBinTree(16));
        tree.getRight().getLeft().setRight(new IntBinTree(17));



        DotViewer.displayWindow(tree, "IntBinTree").setExitOnClose();

        System.out.println("Height: " + tree.height());
        System.out.println("Max Sum: " + tree.maxSum());
        System.out.println("Max Path: " + tree.maxPath());
    }
}
